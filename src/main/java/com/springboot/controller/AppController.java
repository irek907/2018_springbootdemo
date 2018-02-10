package com.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@EnableAutoConfiguration  
@RequestMapping("/test")  
public class AppController {      
    @RequestMapping("/sayhello")  
    public String sayHello(){  
        return "Hello World!";  
    }  
}  