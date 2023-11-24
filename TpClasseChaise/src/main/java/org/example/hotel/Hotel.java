package org.example.hotel;

import java.util.Arrays;

public class Hotel {
    protected String name;
    Room[] rooms;
    Booking[] bookings;
    Client[] clients;

    public Hotel() {
    }

    public Hotel(String name, Room[] rooms, Booking[] bookings, Client[] clients) {
        this.name = name;
        this.rooms = rooms;
        this.bookings = bookings;
        this.clients = clients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Booking[] getReservations() {
        return bookings;
    }

    public void setReservations(Booking[] bookings) {
        this.bookings = bookings;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Hotel { " +
                " name: '" + name + '\'' +
                " || rooms: " + Arrays.toString(rooms) +
                " || reservations: " + Arrays.toString(bookings) +
                " || clients: " + Arrays.toString(clients) +
                " }";
    }
}
