package com.springboot.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.user.domain.User;

public interface UserJpaRepository extends JpaRepository<User,Long> {

}