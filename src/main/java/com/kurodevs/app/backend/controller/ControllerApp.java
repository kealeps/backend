package com.kurodevs.app.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApp {
    
    @GetMapping("/hello")
    public String hello(@PathVariable String name){
        return "Hello world!";
    }
}
