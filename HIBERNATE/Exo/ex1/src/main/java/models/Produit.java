package models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "product")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String marque;

    private String reference;


    private LocalDate dateAchat;

    private double prix;

    private int stock;

    public Produit() {
    }

    public Produit(String marque, String reference, LocalDate dateAchat, double prix) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(LocalDate dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Produit " +
                "|id = " + id +
                "| marque = '" + marque + '\'' +
                "| reference = '" + reference + '\'' +
                "| dateAchat = " + dateAchat +
                "| prix = " + prix +
                "| stock = " + stock +
                '|';
    }
}
