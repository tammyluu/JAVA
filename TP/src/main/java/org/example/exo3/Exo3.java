package org.example.exo3;

import java.util.Scanner;

public class Exo3 {
    public static Scanner sc = new Scanner(System.in);
    public static void isNombre() {
        int nbr = 0;
        System.out.print("Donne moi un nombre: ");
         nbr = sc.nextInt();
        if (nbr > 0) {
            System.out.println(" Vous nombre est positif");
        } else if (nbr < 0) {
            System.out.println(" Vous nombre est negatif");
        } else {
            System.out.println(" Vous nombre est Zéro");
        }
        sc.close();
    }

    public static void categoryAge() {
        int age = 0;
        System.out.print("Saisissez votre age: ");
        age = sc.nextInt();
        if (age >= 6 && age <= 7) {
            System.out.println("Poussin");
        } else if (age >= 8 && age <= 9) {
            System.out.println("Pupille");
        } else if (age >= 10 && age <= 11) {
            System.out.println("Minime");
        } else if (age > 12) {
            System.out.println("Cadet");
        } else {
            System.out.println("Âge invalide");
        }
        sc.close();
    }
    public static void isNombreEntier() {
        int nbr = 0;
        System.out.print("Donne moi un nombre entier : ");
        nbr = sc.nextInt();
        if (nbr %3 == 0) {
            System.out.println("votre nombre " + nbr + " est divisible par 3");
        } else {
            System.out.println("votre nombre " + nbr + " non divisible par 3");
        }

        sc.close();
    }

    public static void prixPayer() {
        int nbr = 0;
        double total = 0;

        System.out.print("Donne moi le nombre de photocopies effectuées : ");
        nbr = sc.nextInt();

        if (nbr >0 && nbr <10) {
            total = nbr * 0.15;
            System.out.println("prix à payer : "+ nbr + " copies" + "est : " + total + "€");

        } else if (nbr >=10 && nbr <20) {
            total = (nbr * 0.15) +((nbr-10) * 0.10) ;
            System.out.println("prix à payer : "+ nbr + " copies" + "est : " + total + "€");

        }else {
            total = ((nbr * 0.15) +((nbr-10) * 0.10))+ ((nbr-20) * 0.05) ;
            System.out.println("prix à payer : "+ nbr + " copies" + "est : " + total + "€");
        }

        sc.close();
    }



}
