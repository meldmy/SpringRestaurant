package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Dmytro Melnychuk
 */
public class UnderstandSpring
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach cricketCoach = context.getBean( "cricketCoach", CricketCoach.class );
        Coach betaCoach = context.getBean( "betaCoach", Coach.class );
        FortuneService fortune = context.getBean( "fortuneService", FortuneService.class );



        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getTeam());
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println("Cricket coach has fortune from App Context: "+cricketCoach.getFortuneService().equals( fortune ));
        System.out.println("Fortune address inside cricket coach: "+cricketCoach.getFortuneService());
        System.out.println("Fortune address in App Context defined: "+ fortune );
        System.out.println("Fortune address in App Context received second time: "+context.getBean( "fortuneService", FortuneService.class ) );
        System.out.println("Fortune has beta coach from context: "+betaCoach.equals( fortune.getCoach()));

        System.out.println("ComponentCoach say: " + context.getBean( "componentCoach", ComponentCoach.class ).getDailyWorkout());

        context.close();
    }
}
