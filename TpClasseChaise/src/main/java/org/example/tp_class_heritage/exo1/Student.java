package org.example.tp_class_heritage.exo1;

public class Student extends  Person{
    public Student(int age) {
        super(age);
    }

    public void  goToClasses(){
        System.out.println("I'm going to class.");
    }
    public void displayAge(){
        System.out.println( "My age is " + age +
                " years old");
    }


}
