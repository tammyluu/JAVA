package org.example.myToys;

import java.util.Scanner;

public class MyToys {
    //public static double PI = 3.1415;
    public static final double PI = 3.1415;
    public static final int MAX_ELEMENTS = 500;
    public static int getAnInteger(String inputMsg){
        Scanner sc = new Scanner(System.in);
        int n ;
        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n; //break;
            }catch (Exception e){
                System.out.println("Try to fill input again!!!");
            }

        } while (true); // si true continuer "do"

    }
    public static int getWidth(){
        Scanner sc = new Scanner(System.in);
        int width ;
        do {
            try {
                System.out.print("Input an interger:");
                width = Integer.parseInt(sc.nextLine());
                return width; //break;
            }catch (Exception e){
                System.out.println("Try to fill input again!!!");
            }

        } while (true); // si true continuer "do"

    }
    public static int getLength(){
        Scanner sc = new Scanner(System.in);
        int length ;
        do {
            try {
                System.out.print("Input a length:");
                length = Integer.parseInt(sc.nextLine());
                return length; //break;
            }catch (Exception e){
                System.out.println("Try to fill input again!!!");
            }

        } while (true); // si true continuer "do"

    }

}
