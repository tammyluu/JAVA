package org.example.book_arrayList;

import java.util.Date;

public class Loan {
    private Person book;
    private Date startDate;
    private Date endDate;

    public Loan() {
    }

    public Loan(Person book, Date startDate, Date endDate) {
        this.book = book;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Person getBook() {
        return book;
    }

    public void setBook(Person book) {
        this.book = book;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Borrow: " +
                "book=" + book +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '.';
    }
}
