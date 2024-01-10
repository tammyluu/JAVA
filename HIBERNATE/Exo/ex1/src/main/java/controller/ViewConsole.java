package controller;

import models.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import services.ProduitService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ViewConsole {
    private static SessionFactory sessionFactory;
    private static ProduitService produitService;
    private static Scanner scanner;

    public static void menu() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        produitService = new ProduitService();

        scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("################ Produits ###################");
            System.out.println(" 1. Ajouter un produit");
            System.out.println(" 2. Afficher les informations d'un produit");
            System.out.println(" 3. Supprimer un produit");
            System.out.println(" 4. Modifier les informations du produit");
            System.out.println(" 5. Afficher la totalité des produits");
            System.out.println(" 6. Afficher les produits dont le prix est supérieur au montant précisé");
            System.out.println(" 7. Afficher les produits achetés entre deux dates");
            System.out.println(" 8. Afficher les produits dont le stock est inférieur au montant précisé");
            System.out.println(" 9. Afficher la valeur du stock d'une marque");
            System.out.println("10. Afficher le prix moyen des produits");
            System.out.println("11. Afficher la liste des produits d'une marque choisie");
            System.out.println("12. Supprimer les produits d'une marque choisie");

            System.out.println(" 0. Quitter l'application");
            System.out.println("################ ************ ###################");
            System.out.print("Choix : ");

            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
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
                case 5:
                    showAllProducts();
                    break;
                case 6:
                    showProductsByPriceSupInput();
                    break;
                case 7:
                    showProductsByDate();
                    break;
                case 8:
                    showProductsByStock();
                    break;
                case 9:
                    displayAmountOfStockByBrand();
                    break;
                case 10:
                    displayPriceAveragePriceProducts();
                    break;
                case 11:
                    showProductsByBrand();
                    break;
                case 12:
                    deleteProductsByBrand();
                    break;
                case 0:
                    System.out.println("Bye");

                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }

        } while (choice != 0);

    }

    private static void deleteProductsByBrand() {
        try {
            System.out.print("Entrer la marque que vour désirez  supprimer les produits : ");
            String marque = scanner.next();
            produitService.removeProductByBrand(marque);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showProductsByBrand() {
        try {
            System.out.print("Entrer la marque que vour désirez  l' afficher: ");
            String marque = scanner.next();
            List<Produit> produits = produitService.selectAllByBrand(marque);
            for (Produit p : produits
            ) {
                System.out.println("List de produits que vous souhaitez afficher: " + p);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayPriceAveragePriceProducts() {
        Double prixMoyen = produitService.calculPriceAverage();
        System.out.println("Le prix moyen des produits est de " + prixMoyen);
    }

    private static void showProductsByStock() {
            System.out.println("Entrer  pour afficher les produits dont le stock est inférieur : ");
            int stock = scanner.nextInt();
            for (Produit p : produitService.getByStock(stock)
            ) {
                System.out.println("L'info  du stock de ce produit est:  " + p);

            }
    }

    private static void displayAmountOfStockByBrand() {
        try {
            System.out.println("Entrer la marque pour afficher la valeur des stocks que vous désirez : ");
            String marque = scanner.next();
            List<Double> productList = produitService.amountOfStockByBrand(marque);
            int totalStock = 0;
            for (Double i : productList
            ) {
                System.out.println("La valeur du stock pour le produit de la marque  " + marque + " est : " + i);
                totalStock += i;
            }
            System.out.println("La valeur du stock totale est de " + totalStock);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showProductsByDate() {
        try {
            System.out.println("Entrer la date au début(format dd-MM-yyyy) ? :");
            String startDate= scanner.next();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date  min = dateFormat.parse(startDate);
            System.out.println("Entrer la date à la fin (format dd-MM-yyyy) ? :");
            String endDate = scanner.next();
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            Date max = format.parse(endDate);
            List<Produit> productList = produitService.filterByDate(min, max);
            for (Produit p : productList
            ) {
                System.out.println("Les produits dont l'achat est compris entre les date " + min + " et " + max + " sont " + p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void showProductsByPriceSupInput() {
        System.out.print("Entrer un prix initial: ");
        Double prix = scanner.nextDouble();
        List<Produit> produits = produitService.searchByPrice(prix);
        for ( Produit p: produits ) {
            System.out.println("Les produits dont le prix est supérieur à votre prix initial " + prix + " sont :" + p);
        }
    }

    private static void showAllProducts() {
        for ( Produit p :produitService.selectAll()) {
            System.out.println(p);
        }
    }


    private static void updateOneProduct(Scanner scanner) {
        try {
            System.out.print("Entrez l'ID du produit à modifier : ");
            Integer prodId = scanner.nextInt();
            scanner.nextLine();
            Produit produit = produitInfosInput();
            produitService.update(produit,prodId );
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static void removeOneProduct(Scanner scanner) {
        System.out.print("Entrez l'ID du produit à supprimer : ");
        Integer prodId = scanner.nextInt();
        scanner.nextLine();
        produitService.delete(prodId);
        System.out.println("Produit supprimé");

    }

    private static void showDetailOneProduct(Scanner scanner) {
        System.out.print("Entrez l'ID du produit à afficher : ");
        int prodId = scanner.nextInt();
        scanner.nextLine();
        Produit produit = produitService.selectById(prodId);
        System.out.println(produit);
    }

    private static void addNewProduct(Scanner scanner) {
            Produit produit = produitInfosInput();
            produitService.addNew(produit);
            System.out.println("Produit  bien ajouté !!!!");

    }

    public static Produit produitInfosInput() {
        try {
            System.out.print(" Entrer la marque du produit: ");
            String marque = scanner.nextLine();
            System.out.print(" Entrer la reférence du produit: ");
            String ref = scanner.nextLine();
            System.out.print(" Entrer la date de l'achat en format (dd-MM-yyyy): ");
            String dateInput = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date date = dateFormat.parse(dateInput);
            System.out.print(" Entrer le prix d'un produit: ");
            double prix = scanner.nextDouble();
            scanner.nextLine();
            System.out.print(" Entrer le stock du produit: ");
            int stock = scanner.nextInt();
            Produit produit = new Produit();
            produit.setMarque(marque);
            produit.setReference(ref);
            produit.setDateAchat(date);
            produit.setPrix(prix);
            produit.setStock(stock);
            return produit;

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}