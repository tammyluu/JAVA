package org.example.papeterie_hashMap.classes;

public class ArticleUnitaire  extends Article{
    private String nom;
    private double prix;


    public ArticleUnitaire(int ref, String nom, double prix) {
        super(ref);
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return  super.toString() + "Article par Unitaire : " +
                "nom = '" + nom + '\'' +
                ", prix = " + prix ;

    }
}
