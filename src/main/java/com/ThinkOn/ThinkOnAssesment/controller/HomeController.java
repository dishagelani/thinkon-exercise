package com.ThinkOn.ThinkOnAssesment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // Root path "/" to return a welcome message
    @GetMapping("/")
    public String home() {
        return "Welcome to the User Management API!";
    }
}
