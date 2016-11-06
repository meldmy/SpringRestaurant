package com.luv2code.springdemo;

import java.util.Random;


/**
 * @author Dmytro Melnychuk
 */
public class FortuneService
{
    String[] fortunes = {"Go go", "Just do it", "Go to the rock"};
    private Coach coach;


    public FortuneService( Coach coach )
    {
        this.coach = coach;
    }

    public Coach getCoach(){
        return coach;
    }

    public String getFortune(){
        Random  random= new Random();
        return fortunes[random.nextInt(3)];
    }
}
