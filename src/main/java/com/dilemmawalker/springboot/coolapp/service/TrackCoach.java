package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TrackCoach implements Coach {

    TrackCoach(){
        System.out.println("track coach is working");
    }

    @Override
    public String getWorkout(){
        return "daily workout of track coach";
    }
}
