package com.vikas.Controller;

import com.vikas.Service.User.UserSignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private DaoAuthenticationProvider auth;

    @Autowired
    private UserSignUpService userSignUpService;
    @GetMapping("/login/user")
    public Boolean isUserPresent(@RequestParam("uName") String uName, @RequestParam("pass") String pass){
        try {
            Authentication authentication = new UsernamePasswordAuthenticationToken(uName, pass);
            Authentication auth1 = auth.authenticate(authentication);
            SecurityContextHolder.getContext().setAuthentication(auth1);
            return true;
        }
        catch (AuthenticationException e){
            return false;
        }
    }

    @PostMapping("/signup/user")
    public Integer registerUser(@RequestParam("uName") String uName, @RequestParam("pass") String pass){
        return  userSignUpService.addUser(uName, pass);
    }
}
