package com.example.exo_aop_gestionbibliotheque.controller;

import com.example.exo_aop_gestionbibliotheque.dto.BookDTO;
import com.example.exo_aop_gestionbibliotheque.entity.Book;
import com.example.exo_aop_gestionbibliotheque.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController()
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody BookDTO bookDTO) {
        Book book = bookService.save(bookDTO.getTitle(), bookDTO.getAuthor());
        System.out.println("--------------Save a book---------------");
        return ResponseEntity.ok(book);
    }

    @GetMapping
    public ResponseEntity<List<Book>> get() {
        List<Book> books = bookService.findAll();
        System.out.println("---------------Get all----------------");
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> get(@PathVariable long id) {
        System.out.println("----------------get one--------------------------");
        return ResponseEntity.ok(bookService.findById(id));

    }

}
