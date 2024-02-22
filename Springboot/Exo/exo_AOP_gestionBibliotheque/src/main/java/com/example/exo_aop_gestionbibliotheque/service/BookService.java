package com.example.exo_aop_gestionbibliotheque.service;

import com.example.exo_aop_gestionbibliotheque.annotation.Log;
import com.example.exo_aop_gestionbibliotheque.annotation.Performance;
import com.example.exo_aop_gestionbibliotheque.entity.Author;
import com.example.exo_aop_gestionbibliotheque.entity.Book;
import com.example.exo_aop_gestionbibliotheque.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Performance
    public Book save(String title, Author author) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    @Log
    public Book findById(long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()){
            return optionalBook.get();
        }
        throw new RuntimeException("Not found");
    }

    @Log
    public List<Book> findAll() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books;
    }
    public void removeBook(Book book) {
        bookRepository.delete(book);
        System.out.println("This book has removed!");
    }
}
