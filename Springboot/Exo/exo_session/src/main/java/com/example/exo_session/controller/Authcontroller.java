package com.example.exo_session.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Authcontroller {
    private static final String USERNAME = "toto";
    private static final String PASSWORD = "tata";

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("login", "OK");
            return "redirect:/protected";
        } else {
            model.addAttribute("error", true);
            return "login";
        }
    }

    @GetMapping("/protected")
    public String protectedPage(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("login") != null && "OK".equals(session.getAttribute("login"))) {
            return "protected";
        } else {
            return "redirect:/login";
        }
    }

}
