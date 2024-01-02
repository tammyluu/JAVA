package org.example.inheritance.CrarftsmanV2.data;

public class Rectangle {
    protected String owner;
    protected String color;
    protected double width;
    private double length;
    //protected double area; // derived field -> attribute => behavior

    public Rectangle() {
    }

    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
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
                ", color='" + color + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
    public void  paint(){
        // ex : 90.5 = 4 espaces ~ %4 dont 1 décimal ~ .1
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", owner,color,width,length,getArea());

    }
    // qui a plusieurs infos, qui va résourdre pb
    public double getArea(){
        return width * length;
    }
}
