package org.example.tp_class_heritage.exo2;

public class Appartment extends  House{
    public Appartment() {
    }

    public Appartment(double surface) {
        super(surface);
    }
    public String toString() {
        return "Je sui un appartment , ma surface est de " +
                + surface +
                " m2";
    }
}
