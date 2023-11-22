package org.example.tp_class_heritage.exo1;

public class App {
    public static void main(String[] args) {
        Person person = new Person();
        person.sayHello();
        Student student = new Student(15);
        student.displayAge();
        student.sayHello();
        student.goToClasses();
        Teacher teacher = new Teacher(40);
        teacher.sayHello();
        teacher.explain();

    }
}
