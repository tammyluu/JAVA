package org.example.papeterie_hashMap.classes;

public class Lot extends Article {
    private Article article;
    private int quantite;
    private int remise;


    public Lot(String ref, String refArticle, int quantite, int remise) {
        super(ref);
        this.article = Article.getArticle(refArticle);
        this.quantite = quantite;
        this.remise = remise;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getRemise() {
        return remise;
    }

    @Override
    public String getNom() {
        return"Lot de " + quantite + " " + article.getNom() ;
    }

    @Override
    public double getPU() {
        return  quantite * article.getPU()* (100 -remise)/100;
    }

    @Override
    public String toString() {
        return  super.toString() + " La remise: " + remise +
                " Compose de:  " + quantite + " "
                + article;

    }
}
