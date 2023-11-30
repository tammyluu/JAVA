package org.example.papeterie_hashMap.classes;

public class Ligne {
    private Article article;
    private int quantite;

    public Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }
    public void afficheToi(){
        System.out.printf("|%8s  | %6s | %22s  | %13s | %10.2f| %n",
                quantite,article.getRef(), article.getNom(),article.getPU(),prixTotal());
    }
    public double prixTotal (){
        return  article.getPU()* quantite;
    }

    @Override
    public String toString() {
        return  article + " "  + quantite ;
    }
}
