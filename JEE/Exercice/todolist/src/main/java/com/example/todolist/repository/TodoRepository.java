package com.example.todolist.repository;

import com.example.todolist.entity.Todo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.Root;

import java.util.List;


@ApplicationScoped
public class TodoRepository extends Repository<Todo> {
    @Override
    public Todo findById(Long id) {
        return getSession().find(Todo.class, (long) id);
    }

    @Override
    public List<Todo> findAll() {
        return  getSession().createQuery("FROM Todo", Todo.class).getResultList();
    }
    public void update(Todo todo) {
        getSession().merge(todo);
    }
    public void delete(Long id) {
        Todo todo = findById(id);
        if (todo != null) {
            getSession().remove(todo);
        }
    }

}
