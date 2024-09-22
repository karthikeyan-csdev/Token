package com.project.token.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1")
public class RegisterController {

    @RequestMapping("/register")
    public String registration(){
        return "Registration";
    }
}
