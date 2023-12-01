package org.example.billetterie.classes;

import lombok.Getter;
import lombok.Setter;

public  class Lieu implements Comparable<Lieu> {
    @Getter
    @Setter
    protected String name;
    protected String address;
    protected  int capacity;

    public Lieu(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public  boolean placesAvailable() {
        return true;
    }


    public void  getNameTheater() {

    }

    @Override
    public int compareTo(Lieu o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public String toString() {
        return "| Lieu " +
                " |nom :  " + name + '\'' +
                " | adresse: " + address + '\'' +
                " | capacite: " + capacity ;

    }
}
