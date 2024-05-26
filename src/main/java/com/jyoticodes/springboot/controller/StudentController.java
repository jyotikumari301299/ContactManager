package com.jyoticodes.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RestController
public class StudentController {
@RequestMapping("/home")
    public ModelAndView home(Model model)
    {
         ModelAndView mv = new ModelAndView("home");
     System.out.println("Home Page Handleer");
     model.addAttribute("name2","ravi");
     model.addAttribute("name1", "rekha");
     model.addAttribute("name3", "priya");
        return mv;
    }
     @RequestMapping("/index")
    public ModelAndView index(Model model)
    {
        ModelAndView mv = new ModelAndView("index");
        model.addAttribute("message", "jyotiii");
        return mv;
    }
    // about route
    @RequestMapping("/about")
    public ModelAndView aboutPage(Model model)
    {
        ModelAndView mv = new ModelAndView("about");
        model.addAttribute("keyy","valueee");
        return mv;
    }

    // services
    //error
    @RequestMapping("/errorpage")
    public ModelAndView errorPage()
    {
        ModelAndView mv = new ModelAndView("errorpage");
        return mv;
    }

}

