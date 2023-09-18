package com.spring.boot.rest.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet(){
        return "Hello Rest Service";
    }
}
