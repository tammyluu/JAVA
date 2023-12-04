package org.example.hotel;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomsList;

    public RoomList() {
        this.roomsList = new ArrayList<Room>();
    }
    public void addRoom(Room room) {
        this.roomsList.add(room);

        System.out.println("\tCette chambre a été ajoutée:\n" + room);

    }
    public void listRoom() {

        System.out.println("Liste des Chambres : ");
        System.out.printf("%-5s %-20s %-15s %-15s \n", "Room's Number" , " isOccupied ","Price", " Capacity of Room");

        for (Room r : roomsList
        ) {
            System.out.println(r.toString());
        }
    }
}
