package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("Swim coach is working");
    }

    @Override
    public String getWorkout(){
        return "Swim 100 m daily!!";
    }
}
