package com.dilemmawalker.springboot.coolapp.rest;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import com.dilemmawalker.springboot.coolapp.service.CricketCoach;
import com.dilemmawalker.springboot.coolapp.service.TrackCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;
    private Coach anotherCoach;

    @Autowired
    DemoController(@Qualifier("trackCoach") Coach coach, @Qualifier("trackCoach") Coach anotherCoach){
        this.coach = coach;
        this.anotherCoach = anotherCoach;
    }

    @GetMapping("/testing")
    public String getWorkoutPlan(){
        return coach.getWorkout();
    }

    @GetMapping("/check")
    public boolean check(){
        System.out.println("comparing beans: myCoach==anotherCoach:  " + (coach == anotherCoach));
        return coach == anotherCoach;
    }

}
