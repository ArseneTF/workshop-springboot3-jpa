package com.student.mproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.mproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
