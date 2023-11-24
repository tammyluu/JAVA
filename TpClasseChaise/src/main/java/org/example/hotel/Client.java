package org.example.hotel;

import org.example.book.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static int count = 0;
    protected int id;
    protected static String firstName;
    protected static String lastName;
    protected static String phone;

    public Client() {
        this.id = ++count;

    }

    public Client(int id, String firstName, String lastName, String phone) {
        this.id = id;
        Client.firstName = firstName;
        Client.lastName = lastName;
        Client.phone = phone;
    }

    public  static void listClient() {
        ArrayList<Client> clientArrayList = new ArrayList<>();
        System.out.println("List de Clients   : ");
        for (int i = 0; i < clientArrayList.size(); i++) {
            System.out.println(clientArrayList.get(i).toString());
        }
    }

    public void bookingInfo() {
    }

    public static void addClient() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Client> clientArrayList = new ArrayList<>();
        Client client = new Client();
        System.out.print("\tSaisissez  client's firstname: ");
        firstName = sc.nextLine();
        System.out.print("\tSaisissez client's lastname: ");
        lastName = sc.nextLine();
        System.out.print("\tSaisissez client's phone number: ");
        phone = sc.nextLine();
        clientArrayList.add(client);


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
    public void  addCLient(Scanner sc){

    }


    @Override
    public String toString() {
        return "Client { " +
                " id=" + id +
                " || firstName: '" + firstName + '\'' +
                " || lastName: '" + lastName + '\'' +
                " || phone: '" + phone + '\'' +
                '}';
    }
}
