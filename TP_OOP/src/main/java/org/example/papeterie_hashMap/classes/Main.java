package org.example.papeterie_hashMap.classes;

import org.example.papeterie_hashMap.classes.enums.Couleur;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Stylo stylo = new Stylo("s1", "Bic", 2, Couleur.BLUE);
        Stylo stylo1 = new Stylo("s2", "Eker", 8.9, Couleur.ROUGE);
        Stylo stylo2 = new Stylo("s3", "toto", 1.2, Couleur.NOIR);

        Ramette ram = new Ramette("r1","Ram1", 2.5,5);
        Ramette ram1 = new Ramette("r2","Ram2", 5.9,15);
        Ramette ram2 = new Ramette("r3","Ram3", 4.5,3);

        Lot lotstylo = new Lot("l1","s2",55,10);

        System.out.println();
        System.out.println("Afficher un Stylo  " + Article.getArticle("s2") );
        System.out.println(Article.getArticle("s1"));
        System.out.println("\nAffiche un lot: ");
        System.out.println(Article.getArticle("l1"));

        Facture facture = new Facture("PAULINE", "12-11-2023", 2);
        facture.ajouterLigne("l1",1);
        facture.ajouterLigne("r2", 43);

        System.out.println("\nAffiche une facture de 2 lignes: ");
        facture.afficheToi();

        System.out.println("Nombre d'article en BDD: "  +  Article.nbrArticleBDD());


    }
}
