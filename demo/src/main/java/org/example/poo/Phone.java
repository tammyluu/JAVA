package org.example.poo;

public class Phone  extends  Product{
    int prix;

    public Phone() {

    }

    public Phone(int id, String name, int prix) {
        super(id, name); // héritage attributes de class parents "super"
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "prix=" + prix +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
