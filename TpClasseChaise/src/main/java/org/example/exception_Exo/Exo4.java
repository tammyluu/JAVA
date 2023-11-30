package org.example.exception_Exo;

public class Exo4 {
    public static void main(String[] args)  {
       Compte compte = new Compte();
       try {
           compte.retirer(3000);
       }catch (SoldInsuffisantException e){
           System.out.println(e.getMessage());
       }
    }

}
