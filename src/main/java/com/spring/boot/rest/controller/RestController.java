package com.spring.boot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/greet")
public class RestController {

    @GetMapping("/msg")
    public String msg(){
        return "Hello Rest Controller from Spring Boot";
    }
}
