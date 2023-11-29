package org.example.papeterie_hashMap.classes;

import java.util.*;

public class Facture  {

    private static  int NB_MAX_LiGNES = 10;
    private static  int numeroCourant = 10;
    private int idFacture = 0;
    private String nomClient;
    private String dateAchat;
    private Ligne[] lignes;
    private int nbLignes = 0;


    public Facture( String nomClient, String dateAchat, int nbLignes,int idFacture) {
        this.nomClient = nomClient;
        this.dateAchat = dateAchat;
        this.lignes = new Ligne[nbLignes];
        //  this.idFacture = ;
    }
    public  Facture (String nomClient, String dateAchat){
        this(nomClient,dateAchat,NB_MAX_LiGNES); // new Facture  # appel le contructor aussus
    }

    public void ajouterLigne (String refArticle, int quantite){

        lignes[nbLignes++] = new Ligne(Article.getArticle(refArticle).quantite);

    }
    public double getPrixTotal (){
        double prixTotal = 0;
        for (int i = 0; i < nbLignes; i++) {
            prixTotal += lignes[i].prixTotal();
        }
        return prixTotal;
    }
    public void  afficheToi(){
        System.out.printf("Facture numero %d; Client : %s; Date: %5 %n",
                "Quantite", "Ref", "Nom" , "Prix Unitaire", "Prix Total");
            for (int i = 0; i <nbLignes ; i++) {
                lignes[i].afficheToi();
            }
            System.out.println("Prix ");
    }
}
