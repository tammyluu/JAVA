package org.example.tp_class_heritage.exo1;

public class Person {
    protected int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
public void sayHello() {
    System.out.println("Hello ");
}
    @Override
    public String toString() {
        return
                "My age is " + age +
                "years old";
    }
}
