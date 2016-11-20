package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Dmytro Melnychuk
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String showSite() {
        return "index";
    }

    @RequestMapping("/processDataForm")
    public String processDataForm(HttpServletRequest request, Model model) {
        // receive string that has been typed by user
        String receivedTesterName = request.getParameter("testerName");
        // adding to Spring model
        model.addAttribute("modelTesterName", receivedTesterName);
        return "process";
    }

}
