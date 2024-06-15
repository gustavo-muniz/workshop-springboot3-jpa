package com.munizdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.munizdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
