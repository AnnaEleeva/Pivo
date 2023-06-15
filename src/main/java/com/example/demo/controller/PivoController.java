package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin
@RequestMapping("/api/")
public interface PivoController extends REST {

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/name")
    public String getRandomName();

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/user")
    UserView getUser(@RequestParam(name = "userId", required = false) String userId);
}
