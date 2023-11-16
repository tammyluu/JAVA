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
            if (nbr >= 1 && nbr<= 3) {
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
            if (nbr >= 10 && nbr<= 20) {
                System.out.println("Bingo !!! Votre nombre est: " + nbr +" entre 10 et 20");
                respones = true;
                break;// Met fin à la boucle
            }  else if (nbr > 20 ) {
                System.out.println("La réponse ne convient pas. Veuillez entrer un nombre plus petit.");
            }else {
                System.out.println("La réponse ne convient pas. Veuillez entrer un nombre plus grand");
            }
        }
        sc.close();
    }

    public static void next10Numbers() {
        int nbr = 0;
        System.out.print("Entrez un nombre départ  : ");
        nbr = sc.nextInt();
        for (int i = 0; i < 10 ; i++) {

            System.out.println("  les dix nombres suivants de votre nombre départ : " + nbr );
            nbr += i ;
        }
    sc.close();
    }

    }

