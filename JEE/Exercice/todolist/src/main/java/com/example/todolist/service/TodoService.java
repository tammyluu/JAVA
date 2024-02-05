package com.example.todolist.service;


import com.example.todolist.dto.TodoDto;
import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.util.HibernateSession;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.NotFoundException;
import org.hibernate.Session;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class TodoService {

    private final TodoRepository todoRepository;

    @Inject
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public TodoDto createTodo(TodoDto todoDto) {
        Todo todo = todoDto.toEntity();
        Session session = HibernateSession.getSessionFactory().openSession();
        todoRepository.setSession(session);
        session.beginTransaction();
        try {
            todoRepository.create(todo);
            session.getTransaction().commit();
            return todo.toDto();
        }catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }finally {
            session.close();
        }
    }
    public TodoDto getTodoById(Long id) {
        try {
            Todo todo = todoRepository.findById(id);
            if (todo == null) {
                throw new NotFoundException("Todo with ID " + id + " not found");
            }
            return todo.toDto();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public String updateStatus(Long id) {
        try {
            Todo todo = todoRepository.findById(id);
            if (todo == null) {
                throw new NotFoundException("Todo with ID " + id + " not found");
            }

            // Update the todo status
            boolean newStatus = false;
            todo.setStatus(newStatus);
            todoRepository.update(todo);

            return "Todo with ID " + id + " updated successfully";
        } catch (Exception ex) {
            throw ex;
        }
    }

    public String delete(Long id) {
        try {
            Todo todo = todoRepository.findById(id);
            if (todo == null) {
                throw new NotFoundException("Todo with ID " + id + " not found");
            }

            todoRepository.delete(id);
            return "Todo with ID " + id + " deleted successfully";
        } catch (Exception ex) {
            throw ex;
        }
    }

    public List<TodoDto> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos.stream()
                .map(Todo::toDto)
                .collect(Collectors.toList());
    }
}
