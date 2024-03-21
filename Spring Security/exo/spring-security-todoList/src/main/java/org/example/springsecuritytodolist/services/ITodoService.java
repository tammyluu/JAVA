package org.example.springsecuritytodolist.services;

import org.example.springsecuritytodolist.entity.Todo;

import java.util.List;
import java.util.Optional;

public interface ITodoService {
    public Todo saveTodo(Todo todo);
    public List<Todo> getAlltodos();
    public Optional<Todo> getTodoById(Long id);
    public Todo updateTodo(Todo todo);
    public  void  deleteTodo (Long id);
}
