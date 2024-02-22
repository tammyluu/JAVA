package com.example.exo_aop_gestionbibliotheque.controller;

import com.example.exo_aop_gestionbibliotheque.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController("")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public boolean addBook(@RequestBody String title) {
        bookService.addBook(title);
        System.out.println("--------addBook------------------");
        return true;
    }

    @GetMapping("/book")
    public List<String> getAllBooks() {
        System.out.println("---------getAll------------------");
        return bookService.getAllBooks();
    }


    @DeleteMapping("/{title}")
    public void removeBook(@PathVariable String title) {
        System.out.println("----------------delete------------------");
        bookService.removeBook(title);
        System.out.println("Book deleted");
    }
}
