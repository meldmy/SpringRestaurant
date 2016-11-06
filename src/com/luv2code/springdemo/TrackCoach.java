package com.luv2code.springdemo;

/**
 * @author Dmytro Melnychuk
 */
public class TrackCoach implements Coach
{
    private Coach coach;
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }
}
