package org.example.book_arrayList;

import java.util.Objects;

public class Book {
    public static int count = 0;
    private int id;
    private String title;

    public Book() {
    }

    public Book(int id, String title) {
        this.id = ++count;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book: " +
                "id=" + id +
                ", title='" + title + '\'' +
                '.';
    }
}
