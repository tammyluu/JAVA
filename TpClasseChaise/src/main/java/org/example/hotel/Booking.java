package org.example.hotel;

public class Booking {
    public static int count = 0;
   private int id;
    private boolean isValid = true;
    private Client client;
    private Room room;

    public Booking() {
        this.id= ++count;
    }

    public Booking(boolean isValid, Client client, Room room) {
        this.isValid = isValid;
        this.client = client;
        this.room = room;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Booking.count = count;
    }

    public static void bookingList() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation { " +
                "id=" + id +
                " || isValid=" + isValid +
                " || client=" + client +
                " || room=" + room +
                " }";
    }
}
