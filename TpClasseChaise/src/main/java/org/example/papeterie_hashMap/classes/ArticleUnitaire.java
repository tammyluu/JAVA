package org.example.papeterie_hashMap.classes;

public  abstract class ArticleUnitaire  extends Article{
    private String nom;
    private double pu;


    public ArticleUnitaire(String ref, String nom, double pu) {
        super(ref);
        this.nom = nom;
        this.pu = pu;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public double getPU() {
        return pu;
    }



    @Override
    public String toString() {
        return  super.toString() + "Article par Unitaire : " +
                "nom = '" + nom + '\'' +
                ", prix = " + pu;

    }
}
