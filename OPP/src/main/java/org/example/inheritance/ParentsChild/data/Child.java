package org.example.inheritance.ParentsChild.data;

public class Child extends Parents{
    public Child(String assetOne, String asserTwo) {
        super(assetOne, asserTwo);
    }
    @Override
    public void showProfile(){
        System.out.println("CHILD have " + " assetOne: " + assetOne + " and assetTwo: " + asserTwo);
    }
    public void sayHi(){
        System.out.println("I'm a child. Hi everyone!!!!");
    }
}
