package com.dilemmawalker.springboot.coolapp.config;

import com.dilemmawalker.springboot.coolapp.service.Coach;
import com.dilemmawalker.springboot.coolapp.service.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//in this example we are taking a 3rd party class(SwimCoach).
//wrapping it here & exposing it for usage to outside classes.
//typical example for what @Bean is used for.
@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}


