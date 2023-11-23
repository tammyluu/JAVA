package org.example;

public class Chaises {
    protected int nbPieds;
    protected  String couleur;
    protected  String matetial;

    public Chaises() {
    }

    public Chaises(int nbPieds, String matetial , String couleur) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.matetial = matetial;
    }

    @Override
    public String toString() {

        return "Je suis une chaise avec " +
                 + nbPieds + " pieds en " + matetial + " et de couleur "+
                couleur + "\n"
                ;
    }
}
