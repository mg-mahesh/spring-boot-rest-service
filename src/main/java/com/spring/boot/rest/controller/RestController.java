package com.spring.boot.rest.controller;

import com.spring.boot.rest.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/greet")
public class RestController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/msg")
    public String msg() {
        return greetingService.greet();
    }
}
