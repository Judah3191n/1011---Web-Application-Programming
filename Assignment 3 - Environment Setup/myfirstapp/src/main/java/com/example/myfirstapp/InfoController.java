package com.example.myfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping("/info")
    public String sayWelcome() {
        return "This is a Spring Boot test project created by Judah.";
    }
}
