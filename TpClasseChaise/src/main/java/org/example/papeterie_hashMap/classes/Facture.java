package org.example.papeterie_hashMap.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Facture extends  Lot {

    public  static int count = 0;
    private int idFacture;
    private String nomClient;
    private String dateAchat;
    private ArrayList<Integer> ligneQuantite;
    private HashMap<String, Article> articles;


    public Facture(int ref, int idFacture, String nomClient, String dateAchat, ArrayList<Integer> ligneQuantite, HashMap<String, Article> articles) {
        super(ref);
        this.idFacture = idFacture;
        this.nomClient = nomClient;
        this.dateAchat = dateAchat;
        this.ligneQuantite = new ArrayList<>(10);
        this.articles = new HashMap<>();
    }

    public int getIdFacture() {
        return idFacture;
    }

    public void setIdFacture(int idFacture) {
        this.idFacture = idFacture;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(String dateAchat) {
        this.dateAchat = dateAchat;
    }

    public ArrayList<Integer> getLigneQuantite() {
        return ligneQuantite;
    }

    public void setLigneQuantite(ArrayList<Integer> ligneQuantite) {
        this.ligneQuantite = ligneQuantite;
    }

    public void ajouterLigne (Article refArticle, int quantite){
        if (ligneQuantite.size()<10) {
            ligneQuantite.add(quantite);
            System.out.printf("%-5s %-20s %-15s %-15s \n", "Id Facture ", " Quantité ");
            System.out.println("La ligne ajoutée à la facture:  "+ idFacture + ": " + " Quantité "+quantite);
        }else {
            System.out.println("La facture est pleine, impossible d'ajouter une nouvelle ligne.");
        }
    }
    public double getPrixTotal (){
        double prixTotal = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir le prix unitaire d'article: ");
        float uPrix =sc.nextFloat() ;
        for ( int quantite : ligneQuantite) {

            prixTotal += quantite * uPrix;
        }
        return prixTotal;
    }
    @Override
    public String toString() {
        return "Facture " +
                "| idFacture = " + idFacture +
                "| nomClient='" + nomClient + '\'' +
                "| dateAchat='" + dateAchat + '\'' +
                "| ligneQuantite=" + ligneQuantite ;

    }
}
