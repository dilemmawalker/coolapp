package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
@Component //be default when application starts, all beans are initialized, spring creates an instance of
//each & make them available.
@Lazy // shows this bean won't be injected by default, will only be initialized when:
//1. needed for dependency injection, 2. explicitly requested.
public class BasketballCoach implements Coach{

    public BasketballCoach() {
        System.out.println("basketball coach is working    " + getClass().getSimpleName());
    }

    @Override
    public String getWorkout(){
        return "basketball team is working out";
    }
}
