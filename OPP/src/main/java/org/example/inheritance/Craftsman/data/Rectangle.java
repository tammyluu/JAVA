package org.example.inheritance.Craftsman.data;

public class Rectangle {
    private String owner;
    private String clolor;
    private double width;
    private double length;
    //private double area; // derived field -> attribute => behavior

    public Rectangle() {
    }

    public Rectangle(String owner, String clolor, double width, double length) {
        this.owner = owner;
        this.clolor = clolor;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getClolor() {
        return clolor;
    }

    public void setClolor(String clolor) {
        this.clolor = clolor;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "owner='" + owner + '\'' +
                ", clolor='" + clolor + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    public void  paint(){
        // ex : 90.5 = 4 espaces ~ %4 dont 1 décimal ~ .1
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner,clolor,width,length,getArea());

    }
    // qui a plusieurs infos, qui va résourdre pb
    public double getArea(){
        return width * length;
    }
}
