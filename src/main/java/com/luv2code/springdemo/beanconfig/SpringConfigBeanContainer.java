package com.luv2code.springdemo.beanconfig;

import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.coaches.AlphaCricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Dmytro Melnychuk
 */
@Configuration
@PropertySource("classpath:sport.properties")
public class SpringConfigBeanContainer {

    // add suport for resolve ${...} properties
    @Bean
    public PropertySourcesPlaceholderConfigurer
            propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FortuneService alphaFortuneService(){
        return () -> "Move, guys!";
    }

    @Bean
    public AlphaCricketCoach alphaCricketCoach(){
        return new AlphaCricketCoach(alphaFortuneService());
    }
}
