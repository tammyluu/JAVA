package org.example.interface_fonctionnelle;

import java.util.ArrayList;
import java.util.List;

public class ProduitFiltreur {
    public static List<Produit> filtrerProduits(List<Produit> listeProduits, CritereFiltrage critere){
        List<Produit> produitsFiltres = new ArrayList<>();

        for (Produit p : listeProduits ) {
                if (critere.filtreProduit((p))){
                    produitsFiltres.add(p);
                }
        }
        return produitsFiltres;
    }
}
