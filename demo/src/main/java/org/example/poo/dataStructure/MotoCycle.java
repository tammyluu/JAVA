package org.example.poo.dataStructure;

public class MotoCycle extends Engine implements  Vehicle {
    public MotoCycle() {
        id =Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("I'm a SuperCar who run");
    }

    @Override
    public void startEngine() {
       System.out.println("I'm Starting");
    }
}
