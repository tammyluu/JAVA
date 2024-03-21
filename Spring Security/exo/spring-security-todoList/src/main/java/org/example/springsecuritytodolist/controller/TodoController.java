package org.example.springsecuritytodolist.controller;

import org.example.springsecuritytodolist.entity.Todo;
import org.example.springsecuritytodolist.exception.UserNotFoundException;
import org.example.springsecuritytodolist.services.ITodoService;
import org.example.springsecuritytodolist.services.TodoService;
import org.example.springsecuritytodolist.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @Autowired(required = false) // Optional if authorization requires user details
    private UserService userService;




    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }


    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
       /* try {
            // For clarity, explicitly retrieve user ID from authenticated user (example):
            Long userId = *//* Get user ID from authenticated context *//*;
            Todo savedTodo = todoService.saveTodo(userId, todo);
            return ResponseEntity.ok(savedTodo);
        } catch (UserNotFoundException e) {
            return ResponseEntity.notFound().build();
        }*/
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        if (todo != null) {
            return ResponseEntity.ok(todo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.updateTodo(todo));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodo(id);
        return ResponseEntity.ok().build();
    }
}
