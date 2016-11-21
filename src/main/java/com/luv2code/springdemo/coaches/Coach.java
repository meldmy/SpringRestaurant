package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.coaches.fortune.FortuneService;

/**
 * @author Dmytro Melnychuk
 */
public interface Coach
{
    String getDailyWorkout();

    FortuneService getFortuneService();
}
