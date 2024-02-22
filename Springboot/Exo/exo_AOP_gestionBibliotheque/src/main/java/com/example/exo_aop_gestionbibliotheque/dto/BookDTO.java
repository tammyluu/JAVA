package com.example.exo_aop_gestionbibliotheque.dto;

import com.example.exo_aop_gestionbibliotheque.entity.Author;

public class BookDTO {
    private Long id;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
