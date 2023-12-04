package org.example.book;

public class BookService {


       public Book[] filterBooksByAuthor(Author author, Book[] books) {
        if (author == null || books == null) {
            throw new IllegalArgumentException("Author and books cannot be null");
        }

        int count = 0;
        for (Book book : books) {
            for (Author a: book.getAuthor()
                 ) {
                if (author.getId() == a.getId() || (author.firstName.equals(a.firstName) && author.lastName.equals(a.lastName))) {
                    count++;
                }
            }

        }

        Book[] filteredBooks = new Book[count];
        int index = 0;
        for (Book book : books) {
            for (Author a: book.getAuthor()
            ) {
                if (author.getId() == a.getId() || (author.firstName.equals(a.firstName) && author.lastName.equals(a.lastName))) {
                    count++;
                }
            }
        }

        return filteredBooks;
    }

    public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {

        if (publisher == null || books == null) {
            throw new IllegalArgumentException("Publisher and books cannot be null");
        }

        int count = 0;
        for (Book book : books) {
            if (book.publisher.getChainOfPublisherName().equals(publisher.getChainOfPublisherName()) || book.publisher.getId() == publisher.getId()) {

                count++;

            }
        }

        Book[] filteredBooks = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.publisher.getChainOfPublisherName().equals(publisher.getChainOfPublisherName()) || book.publisher.getId() == publisher.getId()) {
                filteredBooks[index] = book;
                index++;
            }
        }

        return filteredBooks;
    }

    public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
        if (books == null) {
            throw new IllegalArgumentException("Books cannot be null");
        }

        int count = 0;
        for (Book book : books) {
            if (book.getYearPublishing() >= yearFromInclusively) {
                count++;
            }
        }

        Book[] filteredBooks = new Book[count];
        int index = 0;
        for (Book book : books) {
            if (book.getYearPublishing() >= yearFromInclusively) {
                filteredBooks[index] = book;
                index++;
            }
        }

        return filteredBooks;
    }
}
