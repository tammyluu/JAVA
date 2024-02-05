package com.example.todolist.resource;


import com.example.todolist.dto.TodoDto;
import com.example.todolist.service.TodoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("todos")
public class TodoResource {

    private final TodoService todoService;

    @Inject
    public TodoResource(TodoService todoService) {
        this.todoService = todoService;
    }

    @GET
    public List<TodoDto> getAll() {
       List<TodoDto> todoDtoList = todoService.getAllTodos();
       return todoDtoList;
    }

    @GET
    @Path("{id}")
    public TodoDto getById(@PathParam("id") Long id) {
        return todoService.getTodoById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TodoDto post(TodoDto todoDto) {
        return todoService.createTodo(todoDto);
    }

    @PATCH
    @Path("{id}")
    public String pathStatus(@PathParam("id")Long id) {
        return todoService.updateStatus(id);
    }

    @DELETE
    @Path("{id}")
    public String delete(@PathParam("id") Long id) {
        return todoService.delete(id);
    }
}
