package org.example.poo.dataStructure;

public class SuperCar implements Vehicle {
    @Override
    public void drive() {
        System.out.println("I'am a SuperCar who run");
    }

    @Override
    public void startEngine() {
        System.out.println("I'm Starting");
    }
}
