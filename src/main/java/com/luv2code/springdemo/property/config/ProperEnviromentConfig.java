package com.luv2code.springdemo.property.config;

import com.luv2code.springdemo.property.PropertyTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Dmytro Melnychuk
 */
@Configuration
@PropertySource("classpath:sport.properties")
public class ProperEnviromentConfig {

    // Spring recommend to use Environment to get the properties
    @Autowired
    private Environment environment;

    @Bean
    public PropertyTeam propEnviromentTeam() {
        String teamName = environment.getProperty("propTeam.name");
        int teamQuantity = Integer.valueOf(environment.getProperty("propTeam.quantity"));
        return new PropertyTeam(teamName, teamQuantity);
    }

    // For resolve property ${...} , we need register a this static method
}
