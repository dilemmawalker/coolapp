package com.dilemmawalker.springboot.coolapp.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary //shows that if multiple coaches are present, this one will be picked by default.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//by default the scope is always Singleton for all beans.
//here we have specified scope as Prototype specifying a new bean will be created & used each time
// it's injected.
public class CricketCoach implements Coach{

    @Override
    public String getWorkout(){
        return "workout boys";
    }

    public CricketCoach() {
        System.out.println("cricket coach is working");
    }
}
