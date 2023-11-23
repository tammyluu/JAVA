package org.example.tp_class_heritage.exo2;

public class App {
    public static void main(String[] args) {
       /* Person p = new Person("Thomas");
        System.out.println(p);*/
        Appartment app = new Appartment(50);
        System.out.println(app);

        Door d = new Door("blue");
        System.out.println(d);

    }
}
