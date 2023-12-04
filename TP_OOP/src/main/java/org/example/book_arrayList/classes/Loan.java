package org.example.book_arrayList.classes;

import java.time.LocalDate;

public class Loan {
    private Person person;
    private Book book;
    private LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(Person person, Book book) {
        this.person = person;
        this.book = book;
        this.loanDate = LocalDate.now();

    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoantDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan : " +
                "person=" + person +
                ", book=" + book +
                ", loantDate=" + loanDate +
                ", returnDate=" + returnDate ;

    }
}
