package com.luv2code.springdemo.coaches;

import org.springframework.stereotype.Component;

/**
 * @author Dmytro Melnychuk
 */
@Component
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }
}
