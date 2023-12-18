package org.example;


import org.example.utils.Etudiant;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static Connection conn = null;

    public static void main(String[] args) throws SQLException {
        Etudiant etudiant = new Etudiant();
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

                    etudiant.ajouterEtudiant();

                    break;
                case 2:
                   etudiant.afficherTous();
                    break;
                case 3:
                  etudiant.afficherEtudiantByClass();
                    break;
                case 4:
                 etudiant.deleteEtudiantByID();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
        public static void inputProfile () {
            try {
                System.out.print("Merci de saisir le prénom: ");
                String firstName = sc.nextLine();
                System.out.print("Merci de saisir le nom: ");
                String lastName = sc.nextLine();
                System.out.print("Merci de saisir le nom de la classe : ");
                String numClass = sc.nextLine();
                System.out.print("Merci de saisir la date du diplome: ");
                String dateDiplome = sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

    }
}