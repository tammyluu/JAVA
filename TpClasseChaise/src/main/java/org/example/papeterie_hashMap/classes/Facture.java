package org.example.papeterie_hashMap.classes;

import java.util.*;

public class Facture  {

    private static  int NB_MAX_LiGNES = 10;
    private static  int numeroCourant = 0;
    private int idFacture = 0;
    private String nomClient;
    private String dateAchat;
    private Ligne[] lignes;
    private int nbLignes = 0;


    public Facture( String nomClient, String dateAchat, int nbLignes) {
        this.nomClient = nomClient;
        this.dateAchat = dateAchat;
        this.lignes = new Ligne[nbLignes];
        this.idFacture = ++ numeroCourant;
    }
    public  Facture (String nomClient, String dateAchat){
        this(nomClient,dateAchat,NB_MAX_LiGNES); // new Facture  # appel le contructor aussus
    }

    public void ajouterLigne (String refArticle, int quantite){

        lignes[nbLignes++] = new Ligne(Article.getArticle(refArticle),quantite);

    }
    public double getPrixTotal (){
        double prixTotal = 0;
        for (int i = 0; i < nbLignes; i++) {
            prixTotal += lignes[i].prixTotal();
        }
        return prixTotal;
    }
    public void  afficheToi(){
        System.out.printf("Facture numero %d | Client : %s | Date : %s %n",
             idFacture,nomClient,dateAchat );
        System.out.printf("%7s  | %6s | %22s  | %11s | %10s %n", //%n à la ligne
                "Quantite", "Ref", "Nom" , "Prix Unitaire", "Prix Total");
        System.out.println("=========================================================================");

        for (int i = 0; i <nbLignes ; i++) {
                lignes[i].afficheToi();
            }
        System.out.println("Total de la facture : " + getPrixTotal());
    }
}
