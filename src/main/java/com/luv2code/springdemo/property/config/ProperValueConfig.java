package com.luv2code.springdemo.property.config;

import com.luv2code.springdemo.property.PropertyTeam;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Property configuration with two properties, including some that has been missed.
 * If missing.properties is not found, the system is unable to start and throws {@code FileNotFoundException}.
 * Spring 4 give opportunity for using (@code ignoreResourceNotFound} as ignore the not found properties file.
 *
 * @author Dmytro Melnychuk
 */
@Configuration
@PropertySource("classpath:sport.properties")
@PropertySource(value = "classpath:missing.properties", ignoreResourceNotFound = true)
public class ProperValueConfig {

    @Value("${propTeam.name}")
    String teamName;
    @Value("${propTeam.quantity}")
    int teamQuantity;

    // For resolve property ${...} , we need register a this static method
    @Bean
    public static PropertySourcesPlaceholderConfigurer
    propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public PropertyTeam propTeam() {

        return new PropertyTeam(teamName, teamQuantity);
    }
}
