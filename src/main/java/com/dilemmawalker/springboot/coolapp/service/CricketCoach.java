package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Primary
public class CricketCoach implements Coach{

    @Override
    public String getWorkout(){
        return "workout boys";
    }
}
