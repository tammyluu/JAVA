package org.example.papeterie_hashMap.classes;

import org.example.papeterie_hashMap.classes.enums.Couleur;

public class Stylo  extends ArticleUnitaire{
 private Couleur couleur;



    public Stylo(int ref, String nom, double prix, Couleur couleur) {
        super(ref, nom, prix);
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return  super.toString() + "Styl : " +
                "couleur = " + couleur ;

    }
}
