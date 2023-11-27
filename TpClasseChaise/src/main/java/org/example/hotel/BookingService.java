package org.example.hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingService {
    private ArrayList<Booking> bookingsList;

    public BookingService() {
        this.bookingsList = new ArrayList<Booking>();
    }
    public  void  addBookingForOne(Booking booking){
        this.bookingsList.add((booking));
        System.out.println("\tCette réservation a été ajoutée:\n" + booking);
    }
    public void bookingList() {
        System.out.println("Liste des réservation : ");
        System.out.printf("%-5s %-20s %-15s %-15s \n", "Id ", " isValid ", " client", "Room");
        for (Booking b: bookingsList
             ) {
            System.out.println(b.toString());
        }
    }
    public void findBooking(String iId){
        for (Booking b: bookingsList
        ) {
            //if (b.getId()) {


            }

        }
    }
       public  boolean delayBookingForOneClient(Booking booking) {

        return this.bookingsList.remove(booking);

    }


}
