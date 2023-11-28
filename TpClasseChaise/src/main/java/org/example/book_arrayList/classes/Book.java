package org.example.book_arrayList.classes;

import java.util.Objects;

public class Book {
    public static int count = 0;
    private int id;
    private String title;
    private String author;

    public Book() {
    }



    public Book(String title, String author) {
        this.id = ++count;
        this.title = title;
        this.author = author;
    }

    public Book(String toto, String titi, int i, String laMaisoonDeToto) {
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
        return "Book : " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' ;

    }
}
