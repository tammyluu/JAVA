package org.example.papeterie_hashMap.classes;

public class Lot extends Article {
    private ArticleUnitaire unitaire;
    private int quantite;
    private float remise;

    public Lot(int ref) {
        super(ref);
    }

    public Lot(int ref, ArticleUnitaire unitaire, int quantite, float remise) {
        super(ref);
        this.unitaire = unitaire;
        this.quantite = quantite;
        this.remise = remise;
    }

    public ArticleUnitaire getUnitaire() {
        return unitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public float getRemise() {
        return remise;
    }

    @Override
    public String toString() {
        return  super.toString() +"Lot{" +
                "unitaire = " + unitaire +
                ", quantite = " + quantite +
                ", remise = " + remise +
                '}';
    }
}
