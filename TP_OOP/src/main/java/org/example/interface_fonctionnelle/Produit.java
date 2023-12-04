package org.example.interface_fonctionnelle;

import lombok.Data;

@Data
public class Produit {
    private String name;
    private double price;
    private String category;

    public Produit(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public void showProducts (){

        System.out.printf("|%-15s|%-10.2f|%15s|\n", name,price, category);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
