package org.example.hotel;

public class Room {
    protected String roomNumber;
    protected boolean isOccupied = false;
    protected double price;
    protected int capacityOf;

    public Room() {
    }

    public Room(String roomNumber, boolean isOccupied, double price, int capacityOf) {
        this.roomNumber = roomNumber;
        this.isOccupied = isOccupied;
        this.price = price;
        this.capacityOf = capacityOf;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacityOf() {
        return capacityOf;
    }

    @Override
    public String toString() {
        return "Room { " +
                "roomNumber: '" + roomNumber + '\'' +
                " || isOccupied: " + isOccupied +
                " || price: " + price +
                " || capacityOf: " + capacityOf +
                " }";
    }
}
