package org.example.book_arrayList.classes;

import java.util.Objects;

public class Book {
    public static int count = 0;
    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.id = ++count;
        this.title = title;
        this.author = author;
    }


    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book : " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' ;

    }
}
