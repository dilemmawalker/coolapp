package com.dilemmawalker.springboot.coolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${team.name}") // picking up from application.properties within Maven.
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return teamName;
    }

    @GetMapping("/working")
    public String working(){
        return "I am not working";
    }
    
    @GetMapping("/hardoop")
    public String hardoop(){
        return "I am a hardoop";
    }
}
