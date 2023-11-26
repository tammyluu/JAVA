package org.example.hotel;

import org.example.book.Book;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IHM {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        Client[] client = new Client[]{
                new Client(1, "Tommy", "Hilfiger", "001 234 567"),
                new Client(2, "Julia", "Robert", "001 789 567"),
                new Client(3, "Tom", "Cruise", "001 234 396")
        };

        String choose;
        while (true) {
            System.out.println("-------------------   * MENU HOTEL CDA JAVA *  -----------------");
            System.out.println("1-	Ajouter un client ");
            System.out.println("2-	Afficher la liste des clients");
            System.out.println("3-	Afficher les réservations d’un client");
            System.out.println("4-	Ajouter une réservation");
            System.out.println("5-	Annuler une réservation");
            System.out.println("6-	Afficher la liste des réservations");
            System.out.println("Q-  Quitter");
            System.out.println("----------------------------------------------------------------");
            System.out.print("Voulez vous quitter ( Q ) ? ");
            choose = sc.next();
            if ( choose.equalsIgnoreCase("Q")) {
                break;

            }else if (choose.equals ("1")) {
               client.addClient();
            }else if (choose.equals ("2")) {
                Client.listClient();
            }else if (choose.equals ("3")) {
               // Client.bookingInfo();
            }else if (choose.equals ("4")) {
                BookingService.addBookingofOneClient();
            }else if (choose.equals ("5")) {
                BookingService.delayBookingofOneClient();
            }else if (choose.equals("6")) {
                BookingService.bookingList();
            }else  {
                System.out.println("Merci de faire un choix valide");
            }

            System.out.println("\n \n");
            System.out.println("Appuyez sur une touche pour continuer");
            sc.nextLine();
        }
        System.out.println("A bientôt !!!");
    }
    public void addClient() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        Client client = new Client();
        System.out.print("\tSaisissez  client's firstname: ");
        String firstName = sc.nextLine();
        client.setFirstName(firstName);
        System.out.print("\tSaisissez client's lastname: ");
        String lastName = sc.nextLine();
        client.setLastName(lastName);
        System.out.print("\tSaisissez client's phone number: ");
        String phone = sc.nextLine();
        client.setPhone(phone);
        clients.add(client);
        System.out.println("\tCette client a été ajouté:\t" + client);


    }




}


