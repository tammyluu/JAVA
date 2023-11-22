package org.example.function;

import java.util.Scanner;

public class TPFunction {
    public static Scanner sc = new Scanner(System.in);

    public static void exercice1() {

        String input;
        System.out.print("entrez vous des nombres entiers avec des espaces: ");
        input = sc.nextLine();

        String[] numbers = input.split(" ");

        int[] tabNumbers = new int[numbers.length];
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
        for (int nbr : arr) {
            System.out.print("[" + nbr + " " + "]");
        }

    }

    public static int findMaxInArray(int[] intArray) {
        if (intArray.length == 0) {
            System.out.println("Le tableau est vide.");
            return 0;
        }
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }

        }
        return max;
    }

    public static void exo2() {
        System.out.print("Entrez un largeur de votre rectangle: ");
        int largeur = sc.nextInt();
        System.out.print("Entrez un hauteur de votre rectangle: ");
        int hauteur = sc.nextInt();

        drawRectangle(hauteur, largeur);

    }

    public static void drawRectangle(int largeur, int hauteur) {


        for (int i = 0; i < largeur; i++) {
            // Draw columns of the rectangle
            for (int j = 0; j < hauteur; j++) {
                if (j == 0 || j == hauteur - 1 || i == 0 || i == largeur - 1) {
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

        String text = sc.nextLine();
        //getWordAmount(text);

        System.out.println("\nLa phrase " + text + " contient " + getWordAmount(text) + " mots");
    }


    public static int getWordAmount(String text) {


        String[] words = text.trim().split(" ");
        for (String word: words
             ) {
            System.out.print(word + " | ");
        }
        return words.length;
    }
    public static void exo4() {
        System.out.print("Entrez-vous des mots aléatoires séparés par un espace: ");
        String input = sc.nextLine();
        System.out.print("Saisissez la longueur minimale de la chaîne pour filtrer les mots qui ont été saisis: ");
        int minLength = sc.nextInt();

        // Créer un tableau d'objets à partir des mots saisis
        String[] mots = input.split(" ");

        // Appeler la méthode pour filtrer les mots par longueur
        String[] motsFiltres = filterWordsByLenght(minLength, mots);

        // Afficher les mots filtrés
        System.out.println("Mots avec une longueur supérieure ou égale à " + minLength + " :");
        for (String mot : motsFiltres) {
            System.out.println(mot);
        }
    }
    public static String[] filterWordsByLenght(int minLength, String[] mots) {
        // Compter le nombre de mots qui satisfont la condition
        int count = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                count++;
            }
        }
        // Créer un tableau de la bonne taille
        String[] motsFiltres = new String[count];

        // Remplir le tableau avec les mots filtrés
        int index = 0;
        for (String mot : mots) {
            if (mot.length() >= minLength) {
                motsFiltres[index] = mot;
                index++;
            }
        }
        // Renvoyer le tableau
        return motsFiltres;
    }


    public static void exo6() {
        System.out.print("entrez- vous 2 chiffres séparés par un espace: ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();


       System.out.println("\nLe plus grand diviseur commun est : " + gcdRecursive(firstNumber,secondNumber)+"!!!!\n" );

       sc.close();
    }
    //Greatest Common Divisor
    // recursive implementatio
    /*public  static  int splitNumber(int[] arraySplit, int idx){
        if (idx == arraySplit.length-1) {
            return arraySplit[idx];
        }
        int firstNumber = arraySplit[idx];
        int secondNumber = splitNumber(arraySplit, idx+1);
        // __gcd(a,b) is inbuilt library function
        return gcdRecursive(firstNumber,secondNumber);
    }*/
    public static int gcdRecursive(int firstNumber, int secondNumber) {
        int gcd = 1;
        for (int i = 1; i <= firstNumber && i<= secondNumber ; i++) {
            if (firstNumber%i == 0 && secondNumber%i ==0) {
                 gcd = i;
            }
        }
        System.out.printf("le plus grand diviseur commun  %d và %d  est : %d", firstNumber, secondNumber, gcd);
        while (firstNumber != secondNumber) {
            if(firstNumber > secondNumber)
                firstNumber = firstNumber - secondNumber;

            else
               secondNumber = secondNumber - firstNumber;
        }
      return  secondNumber;
    }
}






