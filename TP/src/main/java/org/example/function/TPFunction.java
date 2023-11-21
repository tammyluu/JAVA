package org.example.function;

import java.util.Scanner;

public class TPFunction {
    public static Scanner sc = new Scanner(System.in);

    public static void exercice1() {

        String input;
        System.out.print("entrez vous des nombres entiers avec des espaces: ");
        input = sc.nextLine();

        String [] numbers = input.split(" ");

        int [] tabNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tabNumbers[i] = Integer.parseInt(numbers[i]);
        }
        // Afficher le tableau de nombres en utilisant la boucle for-each
        System.out.println("\nTableau de nombre: ");
            displayArray(tabNumbers);
        int valeurMax = findMaxInArray(tabNumbers);
        System.out.println("\nLa valeur maximale dans le tableau est : " + valeurMax);
    }






    public static void displayArray(int[] arr) {
        int iNumber = 1;
        for (int nbr:arr)
              {
                  System.out.print( "[" +  nbr + " "+ "]");
        }

    }
    public static  int findMaxInArray(int[] intArray){
        if (intArray.length == 0){
            System.out.println("Le tableau est vide.");
            return  0;
        }
        int max = intArray[0];
        for (int i = 1; i < intArray.length ; i++) {
            if(intArray[i]>max){
                max = intArray[i];
            }

        }
        return  max;
    }
    public static void exo2(){
        System.out.print("Entrez un largeur de votre rectangle: ");
        int largeur = sc.nextInt();
        System.out.print("Entrez un hauteur de votre rectangle: ");
        int hauteur = sc.nextInt();

        drawRectangle(hauteur,largeur);

    }
    public static void drawRectangle( int largeur, int hauteur){


        for (int i = 0; i < largeur; i++) {
            // Draw columns of the rectangle
            for (int j = 0; j < hauteur; j++) {
                if (j == 0 || j == hauteur - 1 || i == 0 || i == largeur -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        }

    public static void exo3() {
        System.out.print("Entrez un text: ");
        String word= sc.nextLine();


    }
    public static int getWordAmount( String text) {

    return 0;
    }
    }




