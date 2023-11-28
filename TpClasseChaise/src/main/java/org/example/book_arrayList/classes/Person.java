package org.example.book_arrayList.classes;

public class Person {
    private String lastName;
    private String firstName;

    public Person() {
    }

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person: " +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' ;
    }
}
