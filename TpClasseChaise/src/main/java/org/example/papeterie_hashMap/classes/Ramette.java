package org.example.papeterie_hashMap.classes;

public class Ramette extends ArticleUnitaire {
    private int poidEnGramme;


    public Ramette(String ref, String nom, double prix, int poidEnGramme) {
        super(ref, nom, prix);
        this.poidEnGramme = poidEnGramme;
    }

    public int getPoidEnGramme() {
        return poidEnGramme;
    }

    @Override
    public String toString() {
        return  super.toString() + "poid En Granmme = " + poidEnGramme ;


    }
}
