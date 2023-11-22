package org.example.tp_class_heritage.exo2;

public class House extends  Person{
    protected double surface;

    public House() {
    }

    public House(double surface) {
        this.surface = surface;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
    public void getDoor(){
        System.out.println(" Je suis une porte," );
    }

    @Override
    public String toString() {
        return "Je sui une maison , ma surface est de " +
                + surface +
                " m2";
    }
}
