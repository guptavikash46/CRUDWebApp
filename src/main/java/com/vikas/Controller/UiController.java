package com.vikas.Controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
public class UiController {

    @RequestMapping("/login")
    public String home(){
        return "Login";
    }

    @RequestMapping("/signup")
    public String registration(){
        return "RegisterPage";
    }

    @RequestMapping("/app/home")
    public String homePage(){
        return "HomePage";
    }

    @RequestMapping("/logout")
    public String logout(){
        SecurityContextHolder.clearContext();
        return "Login";
    }

    @RequestMapping("/app/addStudent")
    public String addStudent(){
        return "AddStudent";
    }
}
