package com.luv2code.springdemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Dmytro Melnychuk
 */
@Component
public class CoachRegistrator {
    Coach coach;

    @Autowired
    public CoachRegistrator(@Qualifier("alphaCricketCoach") Coach coach) {
        this.coach = coach;
    }

    public Coach getCoach() {
        return coach;
    }
}
