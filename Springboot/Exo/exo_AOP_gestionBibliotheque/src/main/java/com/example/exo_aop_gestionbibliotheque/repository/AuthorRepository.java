package com.example.exo_aop_gestionbibliotheque.repository;

import com.example.exo_aop_gestionbibliotheque.entity.Author;
import com.example.exo_aop_gestionbibliotheque.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByFirstNameIsContainingIgnoreCase(String firstName);

}
