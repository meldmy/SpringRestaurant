package com.luv2code.springdemo.property.startapp;

import com.luv2code.springdemo.property.PropertyTeam;
import com.luv2code.springdemo.property.config.ProperEnviromentConfig;
import com.luv2code.springdemo.property.config.ProperValueConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;

/**
 * @author Dmytro Melnychuk
 */
public class ProperAnnotationApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProperValueConfig.class);
        PropertyTeam team = context.getBean("propTeam", PropertyTeam.class);
        out.println("Data from @Enviroment: \n");
        printTeamProperties(team);
        AnnotationConfigApplicationContext contextEnv = new AnnotationConfigApplicationContext(ProperEnviromentConfig.class);
        PropertyTeam teamEnv = contextEnv.getBean("propEnviromentTeam", PropertyTeam.class);
        out.println("Data from @Value: \n");
        printTeamProperties(teamEnv);

        contextEnv.close();
        context.close();

    }

    private static void printTeamProperties(PropertyTeam team) {
        out.println("Team name: " + team.getName());
        out.println("Team members: " + team.getQuantityMembers());
    }
}
