package org.example.billetterie.classes;

import lombok.Getter;
import lombok.Setter;
import org.example.billetterie.utils.CustomFormatException;

import java.util.ArrayList;
import java.util.regex.Pattern;

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
    public void  setEmail (String mail) throws  CustomFormatException{
        String pattern = "^([a-zA-z0-9_.-]+)@([a-zA-z0-9-]+.\\.?[a-zA-z0-9-]+)\\.([a-z]{2,6})$";
        if (!Pattern.matches(pattern, email)){
            throw new CustomFormatException("Not correct email");
        }
        this.email = email;
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
