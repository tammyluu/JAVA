package org.example.exception_Exo;

public class Compte {
    private double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer (double mt) throws SoldInsuffisantException{


       if (mt > solde) {
           throw new SoldInsuffisantException() ;
       }else {
           solde -= mt;
       }


   }
}
