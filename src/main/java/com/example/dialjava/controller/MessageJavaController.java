package com.example.dialjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message-java")
public class MessageJavaController {
   @GetMapping("/test")
    public String test(@RequestParam(value = "name", defaultValue = "Krishna") String name) {
       return String.format("Hello, %s from Java class example", name);
    }
}
