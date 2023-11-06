package com.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String main(){
        System.out.println("들어옴");
        return "home.html";
    }
}
