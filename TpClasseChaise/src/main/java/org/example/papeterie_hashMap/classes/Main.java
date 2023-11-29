package org.example.papeterie_hashMap.classes;

import org.example.papeterie_hashMap.classes.enums.Couleur;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Stylo stylo = new Stylo(1, "Bic", 2, Couleur.BLUE);
        Stylo stylo1 = new Stylo(2, "Eker", 8.9, Couleur.ROUGE);
        Stylo stylo2 = new Stylo(3, "toto", 1.2, Couleur.NOIR);

        Ramette ram = new Ramette(1,"Ram1", 2.5,5);
        Ramette ram1 = new Ramette(2,"Ram2", 5.9,15);
        Ramette ram2 = new Ramette(3,"Ram3", 4.5,3);

        Lot lotStylo = new Lot(2,stylo1,10,10);
        System.out.println("Afficher un Stylo  " + Article.getBdd() );

    }
}
