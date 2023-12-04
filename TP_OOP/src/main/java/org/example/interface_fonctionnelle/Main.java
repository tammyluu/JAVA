package org.example.interface_fonctionnelle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produit> listeProduits = new ArrayList<>();
        listeProduits.add(new Produit("Pomme", 2.15, "Fruits"));
        listeProduits.add(new Produit("Poire", 3.15, "Fruits"));
        listeProduits.add(new Produit("Salade", 1.75, "Légumes"));
        listeProduits.add(new Produit("Aubergine", 3.95, "Légumes"));
        listeProduits.add(new Produit("Orange", 2.98, "Fruits"));

        CritereFiltrage critereCategory = produit -> "Fruits".equals(produit.getCategory());
        List<Produit> produitsFiltres = ProduitFiltreur.filtrerProduits(listeProduits, critereCategory);

        System.out.println("Produits filtrés par la catégorie :");
        System.out.printf("|%-15s|%-10s|%-15s|\n", "Name","Price", "Category");
        System.out.println("--------------------------------------------");
        for (Produit p : produitsFiltres) {
            p.showProducts();
        }
        CritereFiltrage criterePrix = produit -> produit.getPrice() >= 3;
        List<Produit> produitsFiltresPrice =  ProduitFiltreur.filtrerProduits(listeProduits,criterePrix);
        System.out.println("\nProduits filtrés par le prix :");
        System.out.printf("|%-15s|%-10s|%-15s|\n", "Name","Price", "Category");
        System.out.println("--------------------------------------------");
        for (Produit p : produitsFiltresPrice) {
            p.showProducts();
        }
        CritereFiltrage filter = (CritereFiltrage) (CritereFiltrage) listeProduits.stream().filter(produit -> produit.getPrice() > 3);

        System.out.println(filter);

    }
}

