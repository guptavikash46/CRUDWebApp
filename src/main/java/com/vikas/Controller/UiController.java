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

    @RequestMapping("/app/students")
    public String allStudents(){
        return "AllStudents";
    }

    @RequestMapping("/app/removeStu")
    public String removeStudents(){
        return "RemoveStudents";
    }

    //for University operations

    @RequestMapping("/app/addUniversity")
    public String addUniv(){
        return "AddUniv";
    }

    @RequestMapping("/app/allUniversities")
    public String allUniv(){
        return "AllUniv";
    }

    @RequestMapping("/app/updateUniversities")
    public String updateUniv(){
        return "UpdateUniv";
    }
}
