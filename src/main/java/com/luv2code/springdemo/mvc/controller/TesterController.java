package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.pojo.Tester;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dmytro Melnychuk
 */
@Controller
public class TesterController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        Tester theTester = new Tester();
        theModel.addAttribute("tester", theTester);
        return "tester-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("tester") Tester theTester) {
        return "tester-confirm";
    }

}
