package org.example.hotel;

import org.example.book.Book;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IHM {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClientList clientList = new ClientList();
        BookingService bookingService = new BookingService();

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
            sc.nextLine();
            if ( choose.equalsIgnoreCase("Q")) {
                break;

            }else if (choose.equals ("1")) {
                System.out.print("\tSaisissez  client's firstname: ");
                String firstName = sc.nextLine();

                System.out.print("\tSaisissez client's lastname: ");
                String lastName = sc.nextLine();

                System.out.print("\tSaisissez client's phone number: ");
                String phone = sc.nextLine();
                Client client = new Client( firstName,lastName,phone);
                clientList.addClient(client);

            }else if (choose.equals ("2")) {
                clientList.listClient();
            }else if (choose.equals ("3")) {
                bookingService.bookingList();
            }else if (choose.equals ("4")) {
                System.out.print("\tSaisissez  statut de chambre: ");
                boolean isValid = sc.nextBoolean();

                System.out.print("\tSaisissez client's Name: ");
                Client client = new Client();

                System.out.print("\tSaisissez client's phone number: ");
                Room room =new Room();
                Booking booking = new Booking(isValid,client,room );

                bookingService.addBookingForOne(booking);
            }else if (choose.equals ("5")) {
                //delayBookingofOneClient();
            }else if (choose.equals("6")) {
                //bookingList();
            }else  {
                System.out.println("Merci de faire un choix valide");
            }

            System.out.println("\n \n");
            System.out.println("Appuyez sur une touche pour continuer");
            sc.nextLine();
        }
        System.out.println("A bientôt !!!");
    }
    public void inputInfoManagement(){
        Scanner sc = new Scanner(System.in);
        Client client = new Client();


    }





}


