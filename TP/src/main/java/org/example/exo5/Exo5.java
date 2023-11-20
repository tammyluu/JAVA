package org.example.exo5;

import java.util.Scanner;

public class Exo5 {
    public static Scanner sc = new Scanner(System.in);

    public static void isMyNumber() {
        boolean respones = true;
        int nbr = 0;
        while (respones) {
            // Demander à l'utilisateur d'entrer un nombre
            System.out.print("Entrez un nombre entre 1 et 3 : ");
            nbr = sc.nextInt();

            // Vérifier si la réponse convient
            if (nbr >= 1 && nbr <= 3) {
                System.out.println("La réponse convient.");
                respones = true;
                break;// Met fin à la boucle
            } else {
                System.out.println("La réponse ne convient pas. Veuillez entrer un nombre entre 1 et 3.");
            }
        }
        sc.close();
    }

    public static void isJustPrice() {
        boolean respones = true;
        int nbr = 0;
        while (respones) {
            // Demander à l'utilisateur d'entrer un nombre
            System.out.print("Entrez un nombre entre 10 et 20 : ");
            nbr = sc.nextInt();

            // Vérifier si la réponse convient
            if (nbr >= 10 && nbr <= 20) {
                System.out.println("Bingo !!! Votre nombre est: " + nbr + " entre 10 et 20");
                respones = true;
                break;// Met fin à la boucle
            } else if (nbr > 20) {
                System.out.println("La réponse ne convient pas. Veuillez entrer un nombre plus petit.");
            } else {
                System.out.println("La réponse ne convient pas. Veuillez entrer un nombre plus grand");
            }
        }
        sc.close();
    }

    public static void next10NumbersWhile() {
        int nbr = 0;
        System.out.print("Entrez un nombre départ  : ");
        nbr = sc.nextInt();
        System.out.println("  les dix nombres suivants de votre nombre départ " + nbr + " sont : ");
        int i = 0;
        while (i < 10) {
            nbr++;
            i++;
            System.out.print(nbr + " ");

        }


        sc.close();
    }

    public static void next10NumbersFor() {
        int nbr = 0;
        System.out.print("Entrez un nombre départ  : ");
        nbr = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            nbr++;
            System.out.println("  les dix nombres suivants de votre nombre départ : " + nbr);

        }
        sc.close();
    }

    public static void multiplicationTable() {

        int nbr = 0;
        System.out.print("Entrez un nombre départ  : ");
        nbr = sc.nextInt();
        System.out.println("Table de " + nbr);
        for (int i = 1; i <= 10; i++) {
            System.out.println(nbr + " * " + i + " = " + nbr * i);


        }
        sc.close();
    }

    public static void sumOfNumber() {

        int nbr = 0;
        int sum = 0;
        System.out.print("Entrez un nombre : ");
        nbr = sc.nextInt();

        for (int i = 1; i <= nbr; i++) {
            sum += i;
        }

        // Afficher le résultat
        System.out.println("La somme des entiers jusqu'à " + nbr + " est : " + sum);

        // Fermer le scanner
        sc.close();
    }

    public static void maxNumber() {

        int nbr = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un nombre  numéro " + i + "  : ");
            nbr = sc.nextInt();
            if (nbr > max) {
                max = nbr;
                System.out.println("Votre nombre plus grand est : " + nbr);
            } else {
                System.out.println("Votre nombre plus grand est : " + max);
            }
        }


        sc.close();
    }

    public static void maxNumberPosition() {

        int nbr = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un nombre  numéro " + i + "  : ");
            nbr = sc.nextInt();
            if (nbr > max) {
                max = nbr;
                System.out.println("Votre nombre plus grand est : " + nbr);
                System.out.println(" C'etait le nombre numéro  " + i);
            } else {
                System.out.println("Votre nombre plus grand est : " + max);
                System.out.println(" C'etait le nombre numéro  " + i);
            }
        }


        sc.close();
    }

    public static void factorOfNumber() {

        int nbr = 0;
        int factor = 1;
        System.out.print("Entrez un nombre : ");
        nbr = sc.nextInt();

        for (int i = 1; i <= nbr; i++) {
            factor *= i;
        }

        // Afficher le résultat
        System.out.println("La fatorielle des entiers jusqu'à " + nbr + " est : " + factor);

        // Fermer le scanner
        sc.close();
    }

    public static void maxUnknownNumberPosition() {

        int nbr = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Entrez un nombre  numéro " + i + "  : ");
            nbr = sc.nextInt();

            if (nbr == 0) {
                break;
            } else if (nbr > max) {
                max = nbr;
                System.out.println("Votre nombre plus grand est : " + nbr);
                System.out.println(" C'etait le nombre numéro  " + i);
            } else {
                System.out.println("Votre nombre plus grand est : " + max);
                System.out.println(" C'etait le nombre numéro  " + i);
            }
            sc.close();
        }

        /*public static void amountForBill() {

            int prix = 0;
            int sum = 0;
            int pay;
            System.out.println("Entrez les prix des achats (terminez par 0) : ");
            prix = sc.nextInt();

            while (prix != 0) {
                sum += prix;
                prix = sc.nextInt();
            }
            System.out.print("Entrez la somme payée par le client : ");
            pay = sc.nextInt();

            int returnMoney = pay - sum;
            System.out.println("Monnaie à rendre : " + returnMoney + " €");
            System.out.println("Coupures de 10 Euros : " + (returnMoney / 10));
            System.out.println("Coupures de 5 Euros : " + ((returnMoney % 10) / 5));
            System.out.println("Coupures de 1 Euro : " + ((returnMoney % 10) % 5));
            sc.close();

        }

    }*/
    }
}













