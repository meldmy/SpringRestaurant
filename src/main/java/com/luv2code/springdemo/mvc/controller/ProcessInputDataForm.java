package com.luv2code.springdemo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Dmytro Melnychuk
 */

@Controller
public class ProcessInputDataForm {

    @RequestMapping("/processDataForm")
    public String processDataForm(HttpServletRequest request, Model model) {
        // receive string that has been typed by user
        String receivedTesterName = request.getParameter("testerName");
        String receivedTesterLastName = request.getParameter("testerLastName");
        // adding to Spring model
        model.addAttribute("modelTesterName", receivedTesterName);
        model.addAttribute("modelTesterLastName", receivedTesterLastName);
        return "process";
    }

    @RequestMapping("/processDataFormAnnRequest")
    public String processDataForm(
            @RequestParam("testerName") String testerName,
            @RequestParam("testerLastName") String testerLastName,
            Model model) {
        // adding to Spring model
        model.addAttribute("modelTesterName", testerName);
        model.addAttribute("modelTesterLastName", testerLastName);
        return "process";
    }


}
