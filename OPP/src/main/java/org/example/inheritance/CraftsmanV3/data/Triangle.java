package org.example.inheritance.CraftsmanV3.data;

public class Triangle {
    protected String owner;

    protected double a , b , c;


    public Triangle(String owner,double a, double b) {
        this.owner = owner;
        this.a = a;
        this.b = b;

    }

    public Triangle(String owner, double a, double b, double c) {
        this.owner = owner;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "owner='" + owner + '\'' +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
    public boolean checkTriangle(double a, double b, double c){
        return a +b >c && b+c > a && a+c > b;
    }
    public double getPerimeter(){
        return (a + b+ c);
    }
    public double getAreaByFormuleHeron(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public void paint(){
        System.out.printf("TRIANGLE      |%-15s|%4.1f|%4.1f|%4.1f|%7.2f\n", owner,a,b,c, getAreaByFormuleHeron());
    }
}
