package com.luv2code.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dmytro Melnychuk
 */
@Controller
@RequestMapping("/home")
public class HelloWorldController {

    @RequestMapping("/index")
    public String showSite() {
        return "index";
    }

    @RequestMapping("/requestForm")
    public String requestForm() {
        return "requestparam";
    }

}
