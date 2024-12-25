package com.dilemmawalker.springboot.coolapp.rest;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {
    private Coach coach;

    @Autowired
    InitController(Coach coach){
        this.coach = coach;
    }

    @GetMapping("/init")
    public String firstCall(){
        return coach.getWorkout();
    }

    @PostConstruct//called after construction of all beans is done.
    public void afterInitializeCall(){
        System.out.println("post construct: "+ getClass().getSimpleName());
    }
//    @PreDestroy  // Similarly we also have predestroy to destroy objects immediately after bean initialization.
}
