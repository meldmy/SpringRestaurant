package com.luv2code.springdemo.coaches;

import org.springframework.stereotype.Component;


/**
 * @author Dmytro Melnychuk
 */
@Component
public class ComponentCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "Spend 30 minutes on batting practice";
    }
}
