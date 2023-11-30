package org.example.exception_Exo;

public class Compte {
   public void retirer (float mt) throws SoldInsuffisantException{
       float solde = 2000 ;

       if (mt > solde) throw new SoldInsuffisantException("Solde insuffisant") ;
       solde = solde - mt;

   }
}
