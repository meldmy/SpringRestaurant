package com.luv2code.springdemo.coaches.startapp;

import com.luv2code.springdemo.coaches.CoachRegistrator;
import com.luv2code.springdemo.coaches.TrackCoach;
import com.luv2code.springdemo.coaches.beanconfig.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;


/**
 * @author Dmytro Melnychuk
 */
public class StartApplication {
    public static void main(String[] args) {

        // These two version of load configuration into project: 1) xml, 2) config class
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CoachRegistrator myCoach = context.getBean("coachRegistrator", CoachRegistrator.class);
        printFortunes(myCoach, 5);
        TrackCoach firstPrototypeCoach = context.getBean("trackCoach", TrackCoach.class);
        out.println("These beands are prototypes: " +
                firstPrototypeCoach
                        .equals(context.getBean("trackCoach", TrackCoach.class)));

        context.close();
    }

    private static void printFortunes(CoachRegistrator myCoach, int iterations) {
        while (iterations-- > 0) {
            out.println(myCoach.getCoach().getFortuneService().getFortune());
        }
    }
}
