package org.example.strategy;

import java.util.Random;

public class CartePaymentStrategy implements  PaymentStrategy{
    private Random random = new Random();
    @Override
    public boolean pay(double amount) {
        System.out.println("card payment strategy");
        return random.nextBoolean();
    }

}
