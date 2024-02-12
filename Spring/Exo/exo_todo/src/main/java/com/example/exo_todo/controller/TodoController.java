package com.example.exo_todo.controller;

import com.example.exo_todo.models.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TodoController {
    @RequestMapping(value = "/todos")
    public String getTodos(Model model) {
        model.addAttribute("name","shooping");
        model.addAttribute("description","pleasure");
        model.addAttribute("done","true");
        return "home";
    }
}
