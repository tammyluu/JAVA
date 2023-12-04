package org.example.exception_Exo;

public class Exo4 {
    public static void main(String[] args)  {
       Compte compte = new Compte(100);
       try {
           compte.retirer(105);
       }catch (SoldInsuffisantException e){
           System.out.println(e.getMessage());
       }
        System.out.println("Solde actuel: " + compte.getSolde());
    }

}
