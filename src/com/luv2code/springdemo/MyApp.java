package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;


/**
 * @author Dmytro Melnychuk
 */
public class MyApp
{
    public static void main( String[] args )
    {
        Coach theCoach = new TrackCoach();

        System.out.println( theCoach.getDailyWorkout());
    }
}
