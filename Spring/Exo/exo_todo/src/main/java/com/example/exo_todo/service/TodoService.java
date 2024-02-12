package com.example.exo_todo.service;

import com.example.exo_todo.models.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();

    Todo getTodoById(int id);

    Todo createTodo(Todo todo);

    Todo updateTodo(int id, Todo todo);

    void deleteTodoById(int id);
}
