package com.vikas.Controller;

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
}
