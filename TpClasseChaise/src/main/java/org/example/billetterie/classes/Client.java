package org.example.billetterie.classes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class Client {
   @Getter
   @Setter
    private String lastName;
    private String firstName;
    private String email;
    private ArrayList<Event> tikets;

    public Client(String lastName, String firstName, String email, ArrayList<Event> tikets) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.tikets = tikets;

    }
    public void buyATicket(){

    }
    public void cancelATicket(){

    }
    @Override
    public String toString() {
        return " Client " +
                " |lastName ='" + lastName + '\'' +
                " |firstName = '" + firstName + '\'' +
                " |email = '" + email + '\'' +
                " |tikets =" + tikets ;
    }
}
