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
@RequestMapping("/api/todos")
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


    @PostMapping("/admin/post")
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
       return ResponseEntity.ok(todoService.save(todo));
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
        Todo todo = todoService.getTodoById(id);
        if (todo != null) {
            return ResponseEntity.ok(todo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/list/{userId}")
    public  List<Todo> getTodosByUser(@PathVariable("userId")Long id){
        return todoService.getAllTodosByUser(id);
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
