package com.example.exo_aop_gestionbibliotheque.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private List<String> books = new ArrayList<>();

    public boolean addBook(String title) {
        books.add(title);
        return true;
    }

    public List<String> getAllBooks() {
        return books;
    }

    public void removeBook(String title) {
        books.remove(title);
    }
}
