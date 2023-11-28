package org.example.book_arrayList.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books;
    private List<Loan> loans;

    public static Scanner sc = new Scanner(System.in);

    public Library() {
        books = new ArrayList<>();
        loans = new ArrayList<>();
    }


    public boolean addBook(Book book) {
        return books.add(book);

    }

    public List<Loan> getLoans() {
        return loans;
    }

    private Loan findLoanBook(int iID) {
        Loan loan = null;
        for (Loan l : loans
        ) {
            if (l.getBook().getId() == iID) {
                loan = l;
                //break; voir derniere element de la liste qui emportera le résultat
            }
        }
        return loan;
    }
    private Book findBookByID(int iID) {
        Book book = null;
        for (Book b : books
        ) {
            if (b.getId() == iID) {
                book = b;
                break; // trouver le premier elément seulement
            }
        }
        return book;
    }

    public boolean deleteBookById(int iID) {
        Book book = findBookByID(iID);

        if ( book != null){
            return books.remove(book);
        }
       return  false;


    }
    public ArrayList<Book> findBooksByName(String title){
        ArrayList<Book> bookList = new ArrayList<>();
        for (Book b: books
             ) {
            if (b.getTitle().contains(title)) {
                bookList.add(b);
            }
        }
        return bookList;
    }
    public ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> bookList = new ArrayList<>();
        for (Book b: books
        ) {
            if (b.getTitle().contains(author)) {
                bookList.add(b);
            }
        }
        return bookList;
    }
    public  boolean borrowABook(int idBook, Person person) {
        boolean result = false;
        Loan loanExisted = findLoanBook(idBook);
        if (loanExisted == null || loanExisted.getReturnDate().isBefore(LocalDate.now()) || loanExisted.getReturnDate().equals(LocalDate.now()));
        Book book = findBookByID(idBook);
        if (book != null){
            Loan loan =new Loan(person,book);
            loans.add(loan);
            result = true;
;        }
        return result;
    }
    public boolean returnABook(int idBook){
        boolean result = false;
        Loan isLoanExisted = findLoanBook(idBook);
        // when the book is not existed and return date is null => book has not already return
        if (isLoanExisted != null && isLoanExisted.getReturnDate() == null) {
            isLoanExisted.setReturnDate(LocalDate.now());
            result =true;
        }

        return  result;
    }


}