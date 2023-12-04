package org.example.papeterie_hashMap.classes;

import org.example.papeterie_hashMap.classes.enums.Couleur;

public class Stylo  extends ArticleUnitaire{
 private Couleur couleur;


    public Stylo(String ref, String nom, double pu, Couleur couleur) {
        super(ref, nom,pu);
        this.couleur = couleur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return  super.toString() + "couleur = " + couleur ;


    }
}
