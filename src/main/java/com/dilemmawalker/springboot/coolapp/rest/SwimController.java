package com.dilemmawalker.springboot.coolapp.rest;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import com.dilemmawalker.springboot.coolapp.service.SwimCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwimController {
    private Coach coach;

    @Autowired
    SwimController(@Qualifier("swimCoach") Coach coach){
        this.coach = coach;
    }

    @GetMapping("/workingout")
    public String checkWorking(){
        return coach.getWorkout();
    }
}
