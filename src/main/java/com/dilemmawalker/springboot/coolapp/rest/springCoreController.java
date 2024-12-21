package com.dilemmawalker.springboot.coolapp.rest;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class springCoreController {

    //Field Injection(Most commonly used, harder to unit test) // not preferred anymore
//    @Autowired
//    @Qualifier("cricketCoach")
//    private Coach mycoach;

    private Coach theCoach;

//    this is Constructor injection in Spring Boot //most preferred, use this only
    @Autowired
    public springCoreController(@Qualifier("basketballCoach")Coach theCoach){
        this.theCoach= theCoach;
    }

//     this is setter injection in Spring Boot  //almost never used.
//    @Autowired
//    public void setCoach(@Qualifier("cricketCoach") Coach thecoach){
//        mycoach= thecoach;
//    }

    @GetMapping("/dailyworkout")
    public String dailyWorkout(){
        return theCoach.getWorkout();
    }
}
