package com.pipeline.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloClass {
    @GetMapping("/user")
    public String sayHi(){
        return "Hi User! Welcome...";
    }
}
