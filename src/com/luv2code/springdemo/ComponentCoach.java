package com.luv2code.springdemo;

import org.springframework.stereotype.Component;


/**
 * @author Dmytro Melnychuk
 */
@Component
public class ComponentCoach
{
    public String getDailyWorkout()
    {
        return "Spend 30 minutes on batting practice";
    }
}
