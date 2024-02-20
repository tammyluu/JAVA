package com.example.exo_session.controller;

import com.example.exo_session.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/")
public class LoginController {
    @Autowired
    private LoginService loginService;


    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String submitLogin(@RequestParam String login,@RequestParam String password){
        if (loginService.login(login,password)){
            return "protected";
        }
        return "login";
    }

    @GetMapping("/protected")
    public String protectedPage(){
        if(loginService.isLogged()){
            return "protected";
        }
        return "redirect:/exercice/login";
    }



}
