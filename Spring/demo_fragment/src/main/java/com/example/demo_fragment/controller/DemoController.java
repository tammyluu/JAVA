package com.example.demo_fragment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    @GetMapping
    public String homPage(){
        return "pagea";
    }

    @GetMapping("/pageb")
    public  String pageb(){
        return "pageb";
    }
}
