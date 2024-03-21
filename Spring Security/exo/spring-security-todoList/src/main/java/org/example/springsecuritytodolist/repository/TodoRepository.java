package org.example.springsecuritytodolist.repository;

import org.example.springsecuritytodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Todo, Long> {
 Todo findTodoById(Long id);

}
