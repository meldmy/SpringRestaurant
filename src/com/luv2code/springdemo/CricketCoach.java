package com.luv2code.springdemo;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;


/**
 * @author Dmytro Melnychuk
 */
public class CricketCoach implements Coach, InitializingBean
{
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    public void initBean(){
        System.out.println("CricketCoach initialized");
    }

    public void destrBean(){
        System.out.println("CricketCoach destroyed");
    }

    @Override
    public String getDailyWorkout()
    {
        return fortuneService.getFortune();
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }


    public void setEmailAddress( String emailAddress )
    {
        System.out.println("CricketCoach: set up email address");
        this.emailAddress = emailAddress;
    }


    public String getTeam()
    {
        return team;
    }


    public void setTeam( String team )
    {
        System.out.println("CricketCoach: set up team address");
        this.team = team;
    }


    public FortuneService getFortuneService()
    {
        return fortuneService;
    }


    public void setFortuneService( FortuneService fortuneService )
    {
        System.out.println("CricketCoach: set up fortune service");
        this.fortuneService = fortuneService;
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Bugaga");
    }
}
