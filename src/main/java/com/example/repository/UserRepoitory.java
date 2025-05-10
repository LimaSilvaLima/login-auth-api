package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.user.User;

public interface UserRepoitory extends JpaRepository<User, String> {
   
}
