package com.example.exo_aop_gestionbibliotheque.service;

import com.example.exo_aop_gestionbibliotheque.entity.Author;
import com.example.exo_aop_gestionbibliotheque.entity.Author;
import com.example.exo_aop_gestionbibliotheque.entity.Book;
import com.example.exo_aop_gestionbibliotheque.repository.AuthorRepository;

import java.util.List;
import java.util.Optional;

public class AuthorService {
    private final AuthorRepository authorRepository;
    private Author author;
    private BookService bookService;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    public Author save(String firsName, String lastName){
        Author author = new Author();
        author.setFirstName(firsName);
        author.setLastName(lastName);
        return  authorRepository.save(author);
    }
    public Author findById(long id) {
        Optional<Author> optionalAuthor = authorRepository.findById(id);
        if(optionalAuthor.isPresent()){
            return optionalAuthor.get();
        }
        throw new RuntimeException("Not found");
    }
    public List<Author> findAll() {
        List<Author> authors = (List<Author>) authorRepository.findAll();
        return authors;
    }
    public  void  removeAuthor(Author author){
        authorRepository.delete(author);
        System.out.println("This author has removed!");
    }

    public Boolean addBookToAuthor(String firstName, Book book){
        authorRepository.findByFirstNameIsContainingIgnoreCase(firstName);
        Author author = authorRepository.findByFirstNameIsContainingIgnoreCase(firstName);

        if (author != null) {
            author.getBooks().add(book);
            authorRepository.save(author);
            System.out.println("book added successful!");
            return true;
        } else {
            System.out.println("Author not found!!!!");
            return false;
        }
    }
}
