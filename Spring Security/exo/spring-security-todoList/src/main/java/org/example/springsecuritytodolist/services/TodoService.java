package org.example.springsecuritytodolist.services;

import org.example.springsecuritytodolist.entity.AppUser;
import org.example.springsecuritytodolist.entity.Todo;
import org.example.springsecuritytodolist.exception.UserNotFoundException;
import org.example.springsecuritytodolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserService userService;

    public Todo saveTodo( Long userId,Todo todo){
        AppUser user = userService.getAppUserById(userId);
        if (user != null) {
            todo.setUser(user);
            return todoRepository.save(todo);
        } else {
            throw new UserNotFoundException(userId);
        }
    }
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
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
