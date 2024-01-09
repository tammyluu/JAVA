package controller;

import dao.ProduitDAO;
import models.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ViewConsole {
    private  static SessionFactory sessionFactory;
    private static ProduitDAO produitDAO;
    public static void menu() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("################ To Do List ###################");
            System.out.println(" 1. Ajouter un produit");
            System.out.println(" 2. Afficher les informations d'un produit");
            System.out.println(" 3. Supprimer un produit");
            System.out.println(" 4. Modifier les informations du produit");
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
                case 0:
                    System.out.println("Bye");
                   
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");    
            }

        }while ( choice != 0);

    }

    private static void updateOneProduct(Scanner scanner) {
        System.out.println("Entrez l'ID du produit à modifier  : ");
        Integer idProd  = scanner.nextInt();
        scanner.nextLine();
        List<Produit> produits = (List<Produit>) produitDAO.selectById(idProd);
        System.out.println("Produit avec l' ID : "+ idProd + " : ");
        for (Produit p : produits){
            System.out.println(p);
        }
    }

    private static void removeOneProduct(Scanner scanner) {
        System.out.println("Entrez l'ID du produit à supprimer : ");
        Integer userId  = scanner.nextInt();
        scanner.nextLine();
        produitDAO.delete(userId);
        System.out.println("Pooduit supprimé");

    }

    private static void showDetailOneProduct(Scanner scanner) {
    }

    private static void addNewProduct(Scanner scanner) {
        try {
            System.out.print(" Entrer la marque du produit: " );
            String marque = scanner.nextLine();
            System.out.print(" Entrer la reférence du produit: " );
            String ref = scanner.nextLine();
            System.out.print(" Entrer la date de l'achat en format (dd-MM-yyyy): " );
            String dateInput = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ofPattern("dd.MM.yyyy"));

            System.out.print(" Entrer le prix d'un produit: " );
            Double prix = scanner.nextDouble();
            System.out.print(" Entrer le stock du produit: " );
            Integer stock = scanner.nextInt();
            Produit produit = new Produit(marque,ref, date,prix,stock);
            produitDAO.addNew(produit);
            System.out.println("Produit  bien ajouté !!!!");


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}