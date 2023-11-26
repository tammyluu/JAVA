package org.example.exception;

import java.util.Scanner;

public class Samurai {
    public static void main(String[] args) {
       // inputProfile();
        inputProfileCorrect();
    }
    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("input name : ");
        name = sc.nextLine().toUpperCase();
        //yob = Integer.parseInt(sc.nextLine());
        try {
            // command not sure, can have errors
            System.out.print("input year of birth : ");
            String tmp = sc.nextLine();
            yob = Integer.parseInt(tmp);
        } catch (Exception e){
            // e is a red message that JVM send when code has an error
            // inside JVM we have Exception e = new Exception(error message)
            // 2 solutions : 1st is by default, 2nd undo your input
            //1st is by default
            yob = 69;
        }


        System.out.print("input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("\n--------Your profile -------------");
        System.out.println("Your name: "+ name);
        System.out.println("Your yob: "+yob);
        System.out.println("Your address: "+ address);
        System.out.println("-------End of your profile---------");
    }
    public static void inputProfileCorrect() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("input name : ");
        name = sc.nextLine().toUpperCase();
        //2nd undo your input, loop
        while (true){
            try {
                // command not sure, can have errors
                System.out.print("input year of birth : ");
                yob = Integer.parseInt(sc.nextLine());
                break; // if true
            } catch (Exception e){ // if code is wrong anymore, show error message again and undo the action
                System.out.println("Your int yob is not an integer!!! Try again");
            }

        }


        System.out.print("input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("\n--------Your profile -------------");
        System.out.println("Your name: "+ name);
        System.out.println("Your yob: "+yob);
        System.out.println("Your address: "+ address);
        System.out.println("-------End of your profile---------");
    }
}
