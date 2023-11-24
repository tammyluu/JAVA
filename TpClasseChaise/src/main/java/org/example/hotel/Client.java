package org.example.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static int count = 0;
    protected static int id;
    protected static String firstName;
    protected static String lastName;
    protected static String phone;
    protected static ArrayList<Client> clients = new ArrayList<>();
    public Client() {
        this.id = ++count;

    }

    public Client(int id, String firstName, String lastName, String phone) {

        Client.firstName = firstName;
        Client.lastName = lastName;
        Client.phone = phone;
    }

    public static void addClient() {
        Scanner sc = new Scanner(System.in);

        Client client = new Client();
        System.out.print("\tSaisissez  client's firstname: ");
        firstName = sc.nextLine();
        client.setFirstName(firstName);
        System.out.print("\tSaisissez client's lastname: ");
        lastName = sc.nextLine();
        client.setLastName(lastName);
        System.out.print("\tSaisissez client's phone number: ");
        phone = sc.nextLine();
        client.setPhone(phone);
        clients.add(client);
        System.out.println("\tCette client a été ajouté:\t" + client);


    }

    public static void listClient() {

        System.out.println("Liste des Clients : ");
        System.out.printf("%-5s %-20s %-15s %-15s \n", "Id ", " Prénom ", " Nom", "Numéro Téléphone");
        for (Client c : clients
        ) {
            System.out.println(c.toString());
        }
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
}


