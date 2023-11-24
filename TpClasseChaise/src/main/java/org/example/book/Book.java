package org.example.book;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Book {
     int id;
     String name;
     Author[] author;
     Publisher publisher;
     int yearPublishing;
      int amountOfPages;
     BigDecimal price;
     CoverType coverType;

   // public static int count = 0;

    public Book() {

    }

    public Book(int id, String name, Author[] author, Publisher publisher, int yearPublishing, int amountOfPages, BigDecimal price, CoverType coverType) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearPublishing = yearPublishing;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    @Override
    public String toString() {
        return "Book : {" +
                " id=" + id +
                " || name='" + name + '\'' +
                " ||  author= " + Arrays.toString(author) +
                " ||  publisher= " + publisher +
                " ||  yearPublishing= " + yearPublishing +
                " ||  amountOfPages= " + amountOfPages +
                " ||  price= " + price + " || " +
                " || coverType= " + coverType +
                '}';
    }
}
