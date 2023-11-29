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

        Lot lotStylo = new Lot("AB001","s2",10,10);
        Lot lotStylo2 = new Lot("AB001","s3",20,15);
        Lot lotRam1 = new Lot("AB001","r1",15,25);

        System.out.println("Afficher un Stylo  " + Article.getArticle("s2") );


    }
}
