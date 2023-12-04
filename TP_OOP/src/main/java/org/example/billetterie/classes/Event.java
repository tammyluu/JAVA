package org.example.billetterie.classes;

import lombok.Getter;
import lombok.Setter;

public class Event extends Lieu{
    @Getter
    @Setter
    private   String eventName;
    private String date;
    private String hour;
    private Lieu lieu;
    private float price;
    private int ticketSold;
    private int ticketAvailable;


    public Event(String name, String address, int capacity, String eventName, String date, String hour, Lieu lieu, float price, int ticketSold, int ticketAvailable) {
        super(name, address, capacity);
        this.eventName = eventName;
        this.date = date;
        this.hour = hour;
        this.lieu = lieu;
        this.price = price;
        this.ticketSold = ticketSold;
        this.ticketAvailable = ticketAvailable;
    }

    public boolean checkTicketAvailable(){

        if (ticketAvailable >0){

            System.out.println( "Il reste " + ticketAvailable + " billet(s) disponible(s).");
            return true;
        }else {

            System.out.println("Désolé, tous les billets ont été vendus.");
        }

        return false;

    }

    public void sellTicket(){
        if (checkTicketAvailable()) {
            ticketAvailable--;
            ticketSold++;
            System.out.println("Tickets disponible : " + ticketAvailable + "Tickets vendus : " + ticketSold);
        }else {
            System.out.println("Tous les billet sont vendus");

        }
    }
    public void cancelATicket(){
        if (ticketSold>0){
            ticketAvailable++;
            ticketSold--;
            System.out.println("Vente de billet annulée avec succès.");
        }else {
            System.out.println("Aucun billet n'a été vendu pour cet événement.");
        }
    }


    public boolean placesAvailable() {
        return false;
    }



    @Override
    public String toString() {
        return  super.toString()+
                " |Event: " +  eventName + '\'' +

                " |Date: " + date + '\'' +
                " |Heure: " + hour + '\'' +
                "|Lieu: " + lieu +
                " |Prix: " + price +
                " |nbBilletsVendus: " + ticketSold ;


    }


}
