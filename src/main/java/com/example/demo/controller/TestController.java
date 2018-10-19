package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {
    
    @GetMapping("/login-page.html")
    public String getLogin(){
        return "login-page";
    }
    
    @GetMapping("/financial-page.html")
    public String getFinanc(){
        return "financial-page";
    }
    
    @PostMapping("/login-page.html")
    public String postLogin(){
        return "login-page";
    }
}
