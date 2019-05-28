package com.vikas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
public class UserController {

    @RequestMapping("/home")
    public String home(){
        return "hello";
    }
}
