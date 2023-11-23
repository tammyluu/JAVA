package org.example.poo.dataStructure;

public  abstract class Engine {
    protected  static int count;
    protected int id;
    protected int nbrRoue;
    protected String couleur;

    {
        count++;
    }
    public Engine() {

    }
    public Engine(int id, int nbrRoue, String couleur) {
        this.id = id;
        this.nbrRoue = nbrRoue;
        this.couleur = couleur;
    }

    protected abstract void test();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrRoue() {
        return nbrRoue;
    }

    public void setNbrRoue(int nbrRoue) {
        this.nbrRoue = nbrRoue;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
