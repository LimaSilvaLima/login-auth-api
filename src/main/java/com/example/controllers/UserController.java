package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping
public class UserController {
    @GetMapping("/user")
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("sucesso!");
    }
}