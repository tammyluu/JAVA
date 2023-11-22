package org.example.tp_class_heritage.exo2;

public class Door extends House {
    protected String color;

    public Door(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Je suis une porte, ma couleur est " + color;

    }
}
