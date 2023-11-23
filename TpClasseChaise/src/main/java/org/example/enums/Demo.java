package org.example.enums;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Saisir un lettre :  " );
        String lettre = sc.next();
         String l = lettre.toUpperCase();
         /*String[] lettres = {"A", "B", "C", "D"};

       for (String le : lettres
        ) {
            if (le == l) {

                }
            } else {
                System.out.print("Veuillez de saisir à nouveau le type de message: ");
            }*/
        TypeMessage typeMessage = TypeMessage.valueOf(l);
        switch (typeMessage) {
            case A:
                System.out.println(typeMessage.getPriority().getLabel());
                break;
            case B:
                System.out.println(typeMessage.getPriority().getLabel());
                break;
            case C:
                System.out.println(typeMessage.getPriority().getLabel());
                break;
            case D:
                System.out.println(typeMessage.getPriority().getLabel());
                break;
            default:
                System.out.println("Unknown Priority");
                System.out.print("Veuillez de saisir à nouveau le type de message: ");
        }
        }


    }

