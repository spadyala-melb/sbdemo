package com.spadyala.sbdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {

    @GetMapping("/hello")
    public ResponseEntity<String> greet(){
        return new ResponseEntity<>("Welcome to the Spring Boot World!!", HttpStatus.OK);
    }
}
