package com.luv2code.springdemo;

import com.luv2code.springdemo.coaches.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;


/**
 * @author Dmytro Melnychuk
 */
public class StartApplication
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach myCoach = context.getBean( "cricketCoach", CricketCoach.class );

        out.println(myCoach.getFortuneService().getFortune());
        out.println(myCoach.getFortuneService().getFortune());
        context.close();
    }
}
