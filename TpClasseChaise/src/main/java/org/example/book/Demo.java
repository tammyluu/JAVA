package org.example.book;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Book[] books = new Book[]{
            new Book(1, "Book_1", new Author[] { new Author(1, "Jon", "Johnson") }, new Publisher(1,"Publisher_1"), 1990, 231, BigDecimal.valueOf(24.99), CoverType.PAPERBACK),

            new Book(2, "Book_2", new Author[] { new Author(1, "Jon", "Johnson"), new Author(2,"William", "Wilson") }, new Publisher(2, "Publisher_2 "), 2000, 120,
                        BigDecimal.valueOf(14.99), CoverType.PAPERBACK),

            new Book(3,"Livre_3", new Author[]{new Author(3,"Walter","Peterson")}, new Publisher(1, "Publisher_1"),1997,350,BigDecimal.valueOf(34.99), CoverType.HARDCOUVERTURE)

        };
        BookService service = new BookService();
        Author author = new Author("John", "Johnson");
        Publisher publisher = new Publisher("Publisher_1");
        int year = 1997;

        Book[] filterBooksByAuthor = service.filterBooksByAuthor(author,books);
        Book[] filterBooksByPublisher = service.filterBooksByPublisher(publisher, books);
        Book[] filterBooksByYear = service.filterBooksAfterSpecifiedYear(year, books);

        System.out.println("Our list of books is : ");
        for (Book b :books
             ) {
            System.out.println(b + "\n");
        }

        System.out.println("Search book by " + author  + "\n"   );
        for (Book b: filterBooksByAuthor ) {
            System.out.println(b + "\n");
        }

        System.out.println();

        System.out.println("This is a book which was publised by " + publisher  + "\n");
        for (Book b: filterBooksByPublisher){
            System.out.println(b  + "\n");
        }

        System.out.println();

        System.out.println("This is a book which was published in " + year + "\n");
        for (Book b: filterBooksByYear){
            System.out.println(b  + "\n");
        }



    }

}
