package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getWorkout(){
        return "basketball team is working out";
    }
}
