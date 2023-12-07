package org.example.strategy;

import java.util.Scanner;

public class Main {
    public  static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Order order = new Order.OrderBuilder().totalAmount(1000).build();
        String choice;
        do {
            System.out.println("1 ---- Card ");
            System.out.println("2 ---- Paypal");
            choice = sc.nextLine();
            switch (choice){
                case "1":
                    order.pay(new CartePaymentStrategy());
                    break;
                case  "2":
                    order.pay(new PaypalStrategy());
                    break;
            }
        }while (!choice.equals("0"));
    }
}
