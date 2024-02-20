package com.example.demo_upload_session.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/http-session")
public class SessionRestController {
    //independency which comes outside of my class " _httpSession"
    @Autowired
    private HttpSession _httpSession;
    @GetMapping("/ecrire")
    public String write(){
        // key = name, value = toto
        _httpSession.setAttribute("name", "toto");
        return "ecrit";
    }
    @GetMapping("/ecrire-list") //http://localhost:8080/http-session/ecrire-list
    public String writeList(){
        List<String> stringList = Arrays.asList("titi","toto","toto");

        // key = list, value = stringList
        _httpSession.setAttribute("list", stringList);
        return "liste ecrite";
    }
    @GetMapping("/lire")
    public String read(){
        return  _httpSession.getAttribute("name").toString();
    }
    @GetMapping("/lire-list") //http://localhost:8080/http-session/lire-list
    public List<String> readList(){
        return  (List<String>) _httpSession.getAttribute("list");
    }
    @GetMapping("/supprimer")
    public String remove(){
        _httpSession.removeAttribute("name");
        return "Suppression attribute name ok!!!!";
    }


}
