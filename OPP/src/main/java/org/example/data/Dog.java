package org.example.data;

//khuôn /template/Prototype/blueprint
public class Dog {
   //details Object are properties # variable global
    private String name;
    private int yearOfBirth;
    private  double weight;
    // contructor : no return, create this obj
    public Dog(String iName, int iYearOfBirth, double iweight){
        name = iName;
        yearOfBirth = iYearOfBirth;
        weight = iweight;
    }
    // Method, behavior
    public void bark (){
        /*System.out.println("My name is: " + name);
         System.out.println("My birthday is: " + yearOfBirth);
         System.out.println("My weight is: " + weight);*/
        System.out.printf("|Gaugau|%-8s|%4d|%4.1f|\n", name, yearOfBirth, weight);
    }

}
