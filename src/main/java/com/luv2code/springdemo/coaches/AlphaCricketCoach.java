package com.luv2code.springdemo.coaches;

import com.luv2code.springdemo.coaches.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static java.lang.System.out;


/**
 * @author Dmytro Melnychuk
 */
@Component
@Scope("singleton")
public class AlphaCricketCoach implements Coach
{
    @Value("melnik@mit.com")
    private String emailAddress;
    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public AlphaCricketCoach() {
    }

    public AlphaCricketCoach(FortuneService reservedFortuneService) {
        out.println("Reserved fortune: "+reservedFortuneService.getFortune());
        fortuneService=reservedFortuneService;
    }

    @Override
    public String getDailyWorkout()
    {
        return fortuneService.getFortune();
    }


    public FortuneService getFortuneService()
    {
        return fortuneService;
    }

    @PostConstruct
    public void afterPropertiesSet()
    {
        out.println("CricketCoach initialized");
    }

    @PreDestroy
    public void beforeDestroy()
    {
        out.println("CricketCoach destroyed");
    }

}
