package controller;

import models.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import services.ProduitService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ViewConsole {
    private  static SessionFactory sessionFactory;
    private static ProduitService produitService;
    private static Scanner scanner;
    public static void menu() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("################ Produits ###################");
            System.out.println(" 1. Ajouter un produit");
            System.out.println(" 2. Afficher les informations d'un produit");
            System.out.println(" 3. Supprimer un produit");
            System.out.println(" 4. Modifier les informations du produit");
            System.out.println(" 7. Afficher la liste des produits commandés entre deux dates");

            System.out.println(" 0. Quitter l'application");
            System.out.println("################ ************ ###################");
            System.out.print("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    addNewProduct(scanner);
                    break;
                case 2:
                    showDetailOneProduct(scanner);
                    break;
                case 3:
                    removeOneProduct(scanner);
                    break;
                case 4:
                    updateOneProduct(scanner);
                    break;
                case 7:
                    researchProduitsByPeriod(scanner);
                case 0:
                    System.out.println("Bye");
                   
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");    
            }

        }while ( choice != 0);

    }

    private static void researchProduitsByPeriod(Scanner scanner) {
        try {
            System.out.print(" Entrer la date de l'achat entre deux dates commandées en format (dd-MM-yyyy): ");
            System.out.print(" Entrer la première date de l'achat");
            String dateInput1 = scanner.nextLine();
            System.out.print(" Entrer la deuxième date de l'achat");
            String dateInput2 = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(dateInput1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate endDate = LocalDate.parse(dateInput1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch (Exception e){
            System.out.println(" Error " + e.getMessage());
        }

    }

    private static void updateOneProduct(Scanner scanner) {
        try {
            System.out.println("Entrez l'ID du produit à modifier  : ");
            Integer idProd = scanner.nextInt();
            scanner.nextLine();
            System.out.print(" Entrer la marque du produit: ");
            String marque = scanner.nextLine();
            System.out.print(" Entrer la reférence du produit: ");
            String ref = scanner.nextLine();
            System.out.print(" Entrer la date de l'achat en format (dd-MM-yyyy): ");
            String dateInput = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.print(" Entrer le prix d'un produit: ");
            Double prix = scanner.nextDouble();
            System.out.print(" Entrer le stock du produit: ");
            Integer stock = scanner.nextInt();
            Produit produit = produitService.selectById(idProd);
            produit.setMarque(marque);
            produit.setReference(ref);
            produit.setDateAchat(date);
            produit.setPrix(prix);
            produit.setStock(stock);
            produitService.update(produit);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


    private static void removeOneProduct(Scanner scanner) {
        System.out.println("Entrez l'ID du produit à supprimer : ");
        Integer userId  = scanner.nextInt();
        scanner.nextLine();
        produitService.delete(userId);
        System.out.println("Pooduit supprimé");

    }

    private static void showDetailOneProduct(Scanner scanner) {
        System.out.println("Entrez l'ID du produit à supprimer : ");
        int prodId  = scanner.nextInt();
        scanner.nextLine();
        System.out.println(produitService.selectById(prodId));
    }

    private static void addNewProduct(Scanner scanner) {
        try {
            System.out.print(" Entrer la marque du produit: ");
            String marque = scanner.nextLine();
            System.out.print(" Entrer la reférence du produit: ");
            String ref = scanner.nextLine();
            System.out.print(" Entrer la date de l'achat en format (dd-MM-yyyy): ");
            String dateInput = scanner.nextLine();
            LocalDate date = null;
            try {
                date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                System.out.println("Parsed date: " + date);
            } catch (Exception e) {
                System.out.println("Error parsing the date. Please enter a valid date in the format dd.MM.yyyy.");
            }


            Double prix ;
            while (true) {
                try {
                    System.out.print(" Entrer le prix d'un produit: ");
                    prix = scanner.nextDouble();
                    scanner.nextLine();
                    break; // Break out of the loop if input is successfully read as Double
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Entrer un prix en numérique.");
                    scanner.nextLine(); // Consume invalid input
                }
            }

            Integer stock;
            while (true) {
                try {
                    System.out.print(" Entrer le stock du produit: ");
                    stock = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    break; // Break out of the loop if input is successfully read as Integer
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Entrer un stock en numérique.");
                    scanner.nextLine(); // Consume invalid input
                }
            }

            Produit produit = new Produit();
            produit.setMarque(marque);
            produit.setReference(ref);
            produit.setDateAchat(date);
            produit.setPrix(prix);
            produit.setStock(stock);
            produitService.addNew(produit);
            System.out.println("Produit  bien ajouté !!!!");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}