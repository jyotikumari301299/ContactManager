package com.jyoticodes.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jyoticodes.springboot.forms.UserForm;
import com.jyoticodes.springboot.helper.Message;
import com.jyoticodes.springboot.helper.MessageType;
import com.jyoticodes.springboot.model.User;
import com.jyoticodes.springboot.services.UserServices;

import jakarta.servlet.http.HttpSession;

@Controller
@RestController
public class StudentController {
    @Autowired
    private UserServices userServices;

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

    @RequestMapping("/navbar")
    public ModelAndView navbar(Model model)
    {
        ModelAndView mv = new ModelAndView("navbar");
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
    //login
    @RequestMapping("/login")
    public ModelAndView login(Model model)
    {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
   
    //contact
    @RequestMapping("/contact")
    public ModelAndView contactPage(Model model)
    {
        ModelAndView mv = new ModelAndView("contact");
        return mv;
    }

     //register
     @RequestMapping("/register")
     public ModelAndView registerPage(Model model)
     {
         ModelAndView mv = new ModelAndView("register");
         UserForm userForm = new UserForm();
        //  userForm.setName("kyoyi");
         model.addAttribute("userForm", userForm);
         return mv;
     }



    //Hndling Form methods
    //do-register

    @RequestMapping(value="/do-register", method=RequestMethod.POST)
    public ModelAndView requestMethodName(@ModelAttribute UserForm userForm, HttpSession session) {
        ModelAndView mv = new ModelAndView("register");
        System.out.println("userData from Register form"+userForm);
        //fetch data from register form
        User user = User.builder().
        name(userForm.getName()).
        email(userForm.getEmail()).
        phoneNumber(userForm.getPhoneNumber()).
        password(userForm.getPassword()).
        about(userForm.getAbout()).build();
        //validate the data
        //save the data in db
        User savedUser = userServices.saveUser(user);
       // Show message
       Message message = Message.builder().content("Registration Successful").type(MessageType.Green).build();
       System.out.println("messagee"+message);
       session.setAttribute("message", message);
       System.out.println("session"+session);
        //process the data
        System.out.println("Registering here");
        return mv;
    }
    
    public String doRegister()
    {

        return "";
    }

}

