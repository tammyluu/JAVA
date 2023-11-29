package org.example.papeterie_hashMap.classes;

public class Ramette extends ArticleUnitaire {
    private int poidEnGramme;


    public Ramette(int ref, String nom, double prix, int poidEnGramme) {
        super(ref, nom, prix);
        this.poidEnGramme = poidEnGramme;
    }

    public int getPoidEnGramme() {
        return poidEnGramme;
    }

    @Override
    public String toString() {
        return  super.toString() + "Ramette:[ " +
                "poidEnGranmme = " + poidEnGramme +
                ']';
    }
}
