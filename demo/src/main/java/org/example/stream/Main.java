package org.example.stream;

public class Main {
    public static void main(String[] args) {
        Calculatrice cal = new Calculatrice();
        double totalAddition = cal.calcule(10,30,(a,b) -> a + b);
        double totalSoustraction = cal.calcule(10,30,Calculatrice::soustraction);

    }
}
