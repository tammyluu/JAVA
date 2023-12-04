package org.example.tp_class_heritage.exo2;

public class Person {
    protected String name;
    protected House house;

    public Person() {
    }

    public Person(String name, House house) {
        this.name = name;
        this.house = house;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void haveHouse(){
        System.out.println("Je suis un appartment, ");
    }

    @Override
    public String toString() {
        return "Je m'appelle " + name +".";
    }
}
