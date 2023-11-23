package org.example.book;

public class Author {
    public static int count = 0;
    protected int id ;
    protected String firstName;
    protected  String lastName;

    public Author() {
        this.id = ++count;
    }

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
