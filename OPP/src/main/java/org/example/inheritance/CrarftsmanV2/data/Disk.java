package org.example.inheritance.CrarftsmanV2.data;

public class Disk {
    public static final double PI = 3.14;
    private String owner;
    private String color;
    private String smile; // mat cuoi
    private double radius;

    public Disk(String owner, String color, String smile, double radius) {
        this.owner = owner;
        this.color = color;
        this.smile = smile;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "owner='" + owner + '\'' +
                ", color='" + color + '\'' +
                ", smile='" + smile + '\'' +
                ", radius=" + radius +
                '}';
    }
    public void  paint(){
       
        System.out.printf("|DISK     |%-15s|%-10s|%4s|%4.1f|%7.2f|\n", owner,color,smile,radius,getArea());

    }
    public double getArea(){
        return Math.pow(radius,2) * Disk.PI;// car PI est static : commun => méthode non static utilise avec Static
    }

}
