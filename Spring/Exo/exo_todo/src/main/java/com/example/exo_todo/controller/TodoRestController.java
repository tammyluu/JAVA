package com.example.exo_todo.controller;

import com.example.exo_todo.models.Todo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class TodoRestController {



    @GetMapping(value = "todos")
    public List<Todo> getTodos(){
        List<Todo> todos = List.of(
                new Todo(1, "Shopping", "description1", true),
                new Todo(2, "Gym", "description2", false),
                new Todo(3, "Date Mate", "description3", false)
        );
        return todos;
    }
}
