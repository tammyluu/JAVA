package org.example.string;

import java.util.Scanner;

public class ExoString {
    public  static  final  char SPACE = ' ';
    public  static  final  char TAB = '\t';
    public  static  final  char BREAK_LINE = '\n';
    public static Scanner sc = new Scanner(System.in);

    public static void comptageMot() {
        String word = "Welcome to Java Core";
        int count = 0;
        int size = word.length();
        boolean isNotCounted = true;
        for (int i = 0; i < size; i++) {
            if (word.charAt(i) != SPACE && word.charAt(i) != TAB && word.charAt(i) != BREAK_LINE) {
                if (isNotCounted) {
                    count++;
                    isNotCounted = false;
                }
            } else {
                isNotCounted= true;
            }
        }
        System.out.println("Cette phrase is comprise : " + count +" mots");;
    }
//Écrire une fonction qui va vous permettre de compter le nombre
//d’occurrence d’une lettre dans un mot.
    public static void comptageOccurrence() {
        String word;
        char lettreSearch;
        System.out.print("Entrez un mot : ");
        word = sc.nextLine();
        System.out.print("Entrez une lettre  : ");
        lettreSearch =sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == lettreSearch){
                count++;
            }
        }
        System.out.println("le nombre d’occurrence "+ lettreSearch+ " de dans ce mot "+ word+ " est: " + count);
    }
    //Créer une fonction qui vous permet de vérifier si un mot et l’anagramme
//d’un autre mot.
//Votre fonction prendra en paramètre ces 2 mots et vous pourrez tester
//votre méthode de manière dynamique.
    public static void Anagramme() {
        String first ;
        String second;
        System.out.print("Entrez votre premier mot : ");
        first = sc.nextLine();
        System.out.print("Entrez votre deuxième mot : ");
        second = sc.nextLine();
        boolean isAnagramme = true;
        // 1st method
        if (first == null || second == null){
            System.out.println(!isAnagramme);
        }
        if (first.length() != second.length()) {
            System.out.println(!isAnagramme);
        }
        for (int i = 0; i <  first.length(); i++) {
            if (first.charAt(i) != second.charAt(first.length()-1-i)) {
                System.out.println(!isAnagramme);
            }
        }
        System.out.println( first+ ", "+ second+" sont les mots Anagramme : " +isAnagramme);
    }
    //Créer une fonction qui va vous permettre de vérifier qu’un mot (chaîne de
    //caractère est un palindrome).
    //Là aussi, on pourra tester votre fonction de manière dynamique.
    public static void anagramme2() {
        String first ;
        String second;
        System.out.print("Entrez votre premier mot : ");
        first = sc.nextLine();
        System.out.print("Entrez votre deuxième mot : ");
        second = sc.nextLine();
        boolean isAnagramme = true;
        // 1st method
        if (first == null || second == null){
            System.out.println(!isAnagramme);
        }
        if (first.length() != second.length()) {
            System.out.println(!isAnagramme);
        }
        //String Builder with reverse()
        StringBuilder builder = new StringBuilder(second);
        System.out.println(first.equals(builder.reverse().toString()));;
    }public static void palindrome() {

    }
}
