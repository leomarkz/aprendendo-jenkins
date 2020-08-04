package com.aprendendo.jenkins.resource;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloResource {
    
    @GetMapping("")
    public String hello (){
        return "teste";
    }
    
}
