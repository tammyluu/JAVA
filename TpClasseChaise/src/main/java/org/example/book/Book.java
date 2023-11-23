package org.example.book;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Book {
    protected  int id;
    protected String name;
    protected Author[] author;
    protected  Publisher publisher;
    protected int yearPublishing;
    protected  int amountOfPages;
    protected BigDecimal price;
    protected  CoverType coverType;

    public static int count = 0;

    public Book() {
        this.id = ++count;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", publisher=" + publisher +
                ", yearPublishing=" + yearPublishing +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", coverType=" + coverType +
                '}';
    }
}
