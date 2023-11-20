package org.example.exotableaux;

import java.util.Random;
import java.util.Scanner;

public class ArrayBasic {
    public static Scanner sc = new Scanner(System.in);

    public static void exercice1() {
        int[] tab;
        tab = new int[5];
        tab[0]= 4;
        tab[1]= 2;
        tab[2]= 5;
        tab[3]= 6;
        tab[4]= 8;
        System.out.printf("la valeur de la troisième case du tableau est " + tab[2]);


    }

    public static void exercice2() {
        int tab[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < tab.length; i++) {
            System.out.printf(tab[i] + " ");
        }

    }

    public static void exercice3() {
        int[] tab = {10, 20, 30, 40, 50, 60, 70, 80};
        int nbr = 0;
        boolean isMynumber = false;
        System.out.print("Entrez un valeur  : ");
        nbr = sc.nextInt();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == nbr) {
                isMynumber = true;

                break;
            }
        }
        if (isMynumber) {
            System.out.printf("L'entier " + nbr + " est présent dans le tableau");
        } else {
            System.out.printf("L'entier " + nbr + " n'est pas présent dans le tableau");
        }

        sc.close();
    }

    public static void exercice4() {
        int n = 0;
        int[] arr = new int[n];
        boolean check = false;
        System.out.print("Saisissez nombre de'éléments : ");
        n = sc.nextInt();


        System.out.println("Saisir vos elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Saisir votre " + i + " elémént: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\nTableau initial: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Au moins un élément est impair");
        } else {
            System.out.println("tous les éléments sont pairs ");
        }
        sc.close();

    }

    public static void exercice5() {
        int[] tab = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {

            tab[i] = rand.nextInt(100)+1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");

        }

    }

    public static void exercice6() {
        int[] tab1 = new int[5];
        int[] tab2 = new int[5];
        int sum = 0;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {

            tab1[i] = rand.nextInt(100) +1;
            System.out.print(tab1[i] + " ");
            sum += tab1[i];
        }

        System.out.println("\tla somme des éléments de 1er tableau est: " + sum);
        for (int i = 0; i < 5; i++) {

            tab2[i] = rand.nextInt(100)+1;
            System.out.print(tab2[i] + " ");
            sum += tab2[i];
        }
        System.out.println("\tla somme des éléments de 2ème tableau est: " + sum);


    }

    public static void exercice7() {
        int[] tab = new int[10];
        int temp = tab[0];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {

            tab[i] = rand.nextInt(100);
        }
        System.out.print("Tableau initial: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");

        }
        //sort in array Asc
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (tab[i] > tab[j]) {
                    temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }

        }
        System.out.print("\ntableau en ordre Asc : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("\nle plus grand élément du tableau est:  " + tab[9]);

    }
    //Écrire un algorithme qui permet de trouver le nombre d’occurrences d’une valeur entière dans un tableau de taille N.
    public static void exoTab51() {
        int n;

        int count = 0;
        System.out.print("Saisissez nombre de'éléments : ");
        n = sc.nextInt();
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Saisir votre " + i + " elément: ");
            tab[i] = sc.nextInt();
        }
        System.out.print("Entrez un nombre aléatoir: ");
        int num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (tab[i] == num) {
                count++;

            }
        }
        System.out.println("le nombre d’occurrences d’une valeur " + num + " entière dans un tableau est: " + count);


    }
/*- Comment déterminer si un tableau d’entiers à une dimension est trié par ordre croissant ? Ecrire l'algorithme.*/
    public static void exoTab52() {

    }
/*Écrire un algorithme qui calcule le plus grand écart
     dans un tableau (l’écart est la valeur absolue de la différence de deux éléments).*/
    public static void exoTab53() {
        int[] tab = new int[10];
        int temp = tab[0];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {

            tab[i] = rand.nextInt(100);
        }
        System.out.print("Tableau initial: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");

        }
        // bubule sort in array Asc
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (tab[i] > tab[j]) {
                    temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }

        }
        System.out.print("\ntableau en ordre Asc : ");
        for (int i = 0; i < 10; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    /* Écrire l’algorithme effectuant le décalage des  éléments d’un tableau.*/
    public static void exoTab54() {
        int[] tableau = {1, 2, 3, 4, 5};

        // Afficher le tableau avant le décalage
        System.out.println("Avant le décalage  : " + java.util.Arrays.toString(tableau));

        // Effectuer le décalage vers la droite
        int temp = tableau[tableau.length - 1];
        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }
        tableau[0] = temp;

        // Afficher le tableau après le décalage
       System.out.println("Après le décalage vers la droite : " + java.util.Arrays.toString(tableau));


       // Effectuer le décalage vers la gauche
        int temp2 = tableau[tableau.length - 1];
        for (int i = 1; i > tableau.length +1; i++) {
            tableau[i] = tableau[0];
        }
        tableau[tableau.length-1] = temp2;

            // Afficher le tableau après le décalage
           System.out.println("Après le décalage vers la gauche : " + java.util.Arrays.toString(tableau));


    }
// Écrire un algorithme qui inverse l’ordre des éléments d’un tableau de taille N.
    public static void exoTab55() {

    }
    //Écrire l'algorithme du tri à sélection en supposant qu'il est appliqué sur un  tableau d'entiers déjà rempli de taille N donnée.
    public static void exoTab56() {

    }
    // Écrire l'algorithme du tri à bulles en supposant qu'il est appliqué sur un tableau d'entiers déjà rempli de taille N donnée.
    public static void exoTab57() {

    }
    //Écrire un algorithme qui s’assure que les tableaux t1 et t2 sont réguliers et de mêmes dimensions et fournit dans ce cas leur somme en résultat.
    public static void exoTab58() {

    }
    public static void mergeSortedArray() {
        int[] tab1;
        int m;
        int[] tab2;
        int n;
        int element;
        int[] newTab;
       /* for (int ai : tab2){
            insertElements(ai, tab1, m);
            m++;
        }

        for (int k = 0; k <m ; k++) {
            boolean isElementfound = true;
            if (newTab[k] > element){
               isElementfound = true;
        }

        }*/


    }


}
