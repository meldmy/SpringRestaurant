package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;


/**
 * @author Dmytro Melnychuk
 */
@Component("myFortune")
public class FortuneService {
    String[] fortunes = {
            "First: Go go",
            "Second: Just do it",
            "Third: Go to the rock"};

    public String getFortune() {
        Random random = new Random();
        return fortunes[random.nextInt(3)];
    }
}
