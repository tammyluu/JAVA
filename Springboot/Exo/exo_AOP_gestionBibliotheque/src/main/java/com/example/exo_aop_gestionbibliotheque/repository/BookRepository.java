package com.example.exo_aop_gestionbibliotheque.repository;

import com.example.exo_aop_gestionbibliotheque.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
