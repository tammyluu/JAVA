package org.example.springsecuritytodolist.services;

import org.example.springsecuritytodolist.entity.User;
import org.example.springsecuritytodolist.entity.Todo;
import org.example.springsecuritytodolist.exception.UserNotFoundException;
import org.example.springsecuritytodolist.repository.TodoRepository;
import org.example.springsecuritytodolist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    public Todo save(Todo todo) {
        return todoRepository.save(todo);
    }
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    public  List<Todo> getAllTodosByUser(Long id){
        User user = userRepository.findById(id).orElse(null);
        if (user != null){
            List<Todo> todos = (List<Todo>) todoRepository.findTodoById(id);
            return todos;
        }
        return null;
    }
    public Todo getTodoById(Long id){
        return  todoRepository.findTodoById(id);
    }
    public  Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }
    public  void deleteTodo(Long id){
          todoRepository.deleteById(id);
        System.out.println("Todo deleted");
    }
}
