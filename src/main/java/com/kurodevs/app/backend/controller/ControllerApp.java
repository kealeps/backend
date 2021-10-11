package com.kurodevs.app.backend.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class ControllerApp {
    
    @GetMapping("/hello")
    public Map<String, String> hello(){
        HashMap<String, String> map = new HashMap<>();
        map.put("hello", "world");
        return map;
    }
}
