package com.nilsonSantiago.course.resources;

import com.nilsonSantiago.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Nilson Santiago", "nilson@gmail.com", "219123456", "123");
        return ResponseEntity.ok().body(u);
    }

}