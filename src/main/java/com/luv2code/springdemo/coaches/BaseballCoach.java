package com.luv2code.springdemo.coaches;

import org.springframework.stereotype.Component;

/**
 * @author Dmytro Melnychuk
 */
@Component
public class BaseballCoach implements Coach
{
    public BaseballCoach() {
    }

    public BaseballCoach(String name) {
        System.out.println(name);
    }

    public String getDailyWorkout()
    {
        return "Spend 30 minutes on batting practice";
    }
}
