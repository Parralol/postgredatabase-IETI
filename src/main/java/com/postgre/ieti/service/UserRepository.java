package com.postgre.ieti.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgre.ieti.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
}