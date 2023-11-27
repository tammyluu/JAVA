package org.example.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Client implements Comparable<Client>{
    public static int count = 0;
    protected int id;
    protected  String firstName;
    protected  String lastName;
    protected  String phone;

    {
        this.id = ++count;
    }
    public Client() {


    }

    public Client(String firstName, String lastName, String phone) {

       this.firstName = firstName;
        this.lastName = lastName;
       this.phone = phone;
    }


    public void bookingInfo() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void addCLient(Scanner sc) {

    }


    @Override
    public String toString() {
       /* return "Client { " +
                " id=" + id +
                " || firstName: '" + firstName + '\'' +
                " || lastName: '" + lastName + '\'' +
                " || phone: '" + phone + '\'' +
                '}';
    }*/
        return String.format("%-5d %-20s %-15s %-15s \n", id,firstName,lastName,phone);

    /*public  static void displayClient(Client client){
        System.out.printf("%-5d %-20s %-15s %-15s \n", id,firstName,lastName,phone);
    }*/
    }

    @Override
    public int compareTo(Client o) {
        return this.id;
    }
}


