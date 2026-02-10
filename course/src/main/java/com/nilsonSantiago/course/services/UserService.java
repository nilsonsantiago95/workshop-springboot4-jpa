package com.nilsonSantiago.course.services;

import com.nilsonSantiago.course.entities.User;
import com.nilsonSantiago.course.repositories.UserRepository;
import com.nilsonSantiago.course.services.exceptions.DatabaseException;
import com.nilsonSantiago.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
            Optional<User> userOptional = userRepository.findById(id);
            User user = userOptional.orElseThrow(() -> new ResourceNotFoundException(id));

            try {
                userRepository.deleteById(user.getId());
            } catch(DataIntegrityViolationException e) {
                throw new DatabaseException(e.getMessage());
            }
    }

    public User update(Long id, User obj) {
        User entity = userRepository.getReferenceById(id);
        updateData(entity, obj);
        return userRepository.save(entity);
    }

    private void updateData(User entity, User obj) {

        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }

}