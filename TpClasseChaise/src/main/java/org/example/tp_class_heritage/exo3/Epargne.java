package org.example.tp_class_heritage.exo3;

public class Epargne extends Compte{
    protected double taux;

    public Epargne() {
    }

    public Epargne(double taux) {
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
    public double calculInteret(float taux, double initialSold){
        double soldFinal = initialSold * (1+taux/100);
        return soldFinal;
    }
}
