package com.dilemmawalker.springboot.coolapp.rest;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import com.dilemmawalker.springboot.coolapp.service.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springCoreController {

    //Field Injection(Most commonly used, harder to unit test)
//    @Autowired
//    @Qualifier("cricketCoach")
//    private Coach mycoach;

    private Coach mycoach;

    //this is Constructor injection in Spring Boot
//    @Autowired
//    public springCoreController(Coach theCoach){
//        mycoach= theCoach;
//    }

    // this is setter injection in Spring Boot
    @Autowired
    public void setCoach(@Qualifier("cricketCoach") Coach thecoach){
        mycoach= thecoach;
    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout(){
        return mycoach.getWorkout();
    }
}
