package org.example.exoTableaux;
import java.util.Scanner;

public  class Array {
    public static Scanner sc = new Scanner(System.in);

    public static void exercice1() {
        int tab [] = [5];
        tab[0] = 12;
        tab[1] = 8;
        tab[2] = 21;
        tab[3] = 35;
        tab[4] = 46;
        System.out.printf("la valeur de la troisième case du tableau est " + tab[2]);


    }
    public static void exercice2() {
        int tab [] = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < tab.length ; i++) {
            System.out.printf("la valeur de la troisième case du tableau est " + tab[i]);
        }

    }
    public static void exercice3() {
        int tab [] = {10,20,30,40,50,60,70,80};
        int nbr =0;
        System.out.print("Entrez un valeur  : ");
        nbr = sc.nextInt();
        for (int i = 0; i < tab.length ; i++) {
            if (i == nbr) {
                System.out.printf("L'entier " + nbr +" est présent dans le tableau");
            }else {
                System.out.printf("L'entier " + nbr +" n'est pas présent dans le tableau");
            }
        }

    }


}
