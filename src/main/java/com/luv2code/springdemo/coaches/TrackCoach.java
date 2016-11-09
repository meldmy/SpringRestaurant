package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.coaches.fortune.FortuneService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Dmytro Melnychuk
 */
@Component
@Scope("prototype")
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }

    @Override
    public FortuneService getFortuneService() {
        return null;
    }
}
