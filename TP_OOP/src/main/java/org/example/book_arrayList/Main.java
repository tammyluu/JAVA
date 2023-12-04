package org.example.book_arrayList;

import org.example.book_arrayList.classes.*;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new PaperBook("toto", "titi", 45,"la maisoon de toto"));
        library.addBook(new Ebook("tata", "tutui", "epub",45L));
        library.addBook(new Ebook("harry poster", "titi", "pdf",89L));

        System.out.println(library.findBooksByAuthor("t").size());
        library.deleteBookById(3);
        System.out.println(library.findBooksByAuthor("t").size());
        System.out.println(library.findBooksByName("ta"));
        System.out.println(library.getLoans());
        library.borrowABook(2,new Person("Pauline","Laout"));
        System.out.println(library.getLoans());
        library.returnABook(2);
        System.out.println(library.getLoans());


    }
}
