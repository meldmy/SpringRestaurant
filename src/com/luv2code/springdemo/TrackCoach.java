package com.luv2code.springdemo;

/**
 * @author Dmytro Melnychuk
 */
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }
}
