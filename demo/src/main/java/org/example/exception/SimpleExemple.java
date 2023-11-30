package org.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExemple {
    public static void main() {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------Division -------------");
            System.out.print("Donnez moi un nombre: ");
            Integer val = sc.nextInt();
            System.out.print("Donnez moi un diviseur: ");
            Integer diviseur = sc.nextInt();
            double result = val / diviseur;
            System.out.println("Resultat: " + result);
        } catch (ArithmeticException |InputMismatchException  e) {
            System.out.println("Message error: " + e.getMessage());

            return;
        } /*catch (InputMismatchException e) {
            System.out.println("Problème de saisie!!!");
        }*/ catch (Exception e) {
            System.out.println("Une exception !!!!");

        }
        System.out.println("Fin de programme");
    }
}