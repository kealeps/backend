package com.kurodevs.app.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://kurodevs.github.io/")
public class ControllerApp {
    
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }
}
