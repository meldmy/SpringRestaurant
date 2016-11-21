package com.luv2code.springdemo.coaches.beanconfig;

import com.luv2code.springdemo.coaches.fortune.FortuneService;
import com.luv2code.springdemo.coaches.AlphaCricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dmytro Melnychuk
 */
@Configuration
public class SpringConfigBeanContainer {

    @Bean
    public FortuneService alphaFortuneService(){
        return () -> "Move, guys!";
    }

    @Bean
    public AlphaCricketCoach alphaCricketCoach(){
        return new AlphaCricketCoach(alphaFortuneService());
    }
}
