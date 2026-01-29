package com.nilsonSantiago.course.repositories;

import com.nilsonSantiago.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}