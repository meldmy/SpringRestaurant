package com.luv2code.springdemo.coaches.beanconfig;

import com.luv2code.springdemo.coaches.AlphaCricketCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;


/**
 * @author Dmytro Melnychuk
 */
public class StartApplicationBeanScope
{
    public static void main( String[] args )
    {
        // These two version of load configuration into project: 1) xml, 2) config class
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigBeanContainer.class);

        AlphaCricketCoach myCoach = context.getBean( "alphaCricketCoach", AlphaCricketCoach.class );
        out.println(myCoach.getFortuneService().getFortune());
        out.println(myCoach.getFortuneService().getFortune());
        out.println(myCoach.getFortuneService().getFortune());
        out.println(myCoach.getDailyWorkout());

        context.close();
    }
}
