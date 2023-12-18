package org.example;


import org.example.utils.ConnectionUtils;
import org.example.utils.Management;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Connection conn = null;
        while (true) {
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher tous les étudiants");
            System.out.println("3. Afficher les étudiants d'une classe");
            System.out.println("4. Supprimer un étudiant");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    ajouterEtudiant();
                    break;
                case 2:
                    afficherTous();
                    break;
                case 3:
                    afficherEtudiantByClass();
                    break;
                case 4:
                    deleteEtudiantByID();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }






    }

}