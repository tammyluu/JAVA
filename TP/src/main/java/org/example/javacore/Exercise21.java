package org.example.javacore;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise21 {
    static Scanner sc = new Scanner(System.in);
   public static  void  calculeCarre(){

       System.out.print("Donne moi un nombre: ");
       Integer nbr = sc.nextInt();
       Integer result = nbr * nbr;

       System.out.println("Voici votre resultat: " + result);
        sc.close();
   }

    public static void dialogue() {
        System.out.print("Quel est votre prénom ? ");
        String prenom = sc.nextLine();
        System.out.println("Bonjour, " + prenom + " !");
        sc.close();
   }

    public static void calTVA() {
        System.out.print("Le prix HT d'artcile est: ");
        Double prixHT = sc.nextDouble();
        System.out.print("Le nombre d'artcile est: ");
        Integer nbr = sc.nextInt();
        System.out.print("Le taux de TVA est: ");
        float taux = sc.nextFloat();
        double prixTTC = prixHT * (1 + taux/100) * nbr;
        System.out.println("Le prix total TTC correspond est: " + prixTTC);
        sc.close();
    }

    public static void isNombre() {
        System.out.print("Donne moi un nombre: ");
        Integer nbr = sc.nextInt();
        if (nbr > 0 ){
            System.out.println(" Vous nombre est positif");
        } else if (nbr < 0 ) {
            System.out.println(" Vous nombre est negatif");
        } else {
            System.out.println(" Vous nombre est Zéro");
        }
        sc.close();

    }

    public static void produitSwitch() {
        System.out.print("Donne moi le premier nombre: ");
        Integer nbr1 = sc.nextInt();
        System.out.print("Donne moi le deuxième nombre: ");
        Integer nbr2 = sc.nextInt();
       //int prod = nbr1* nbr2;
        if ((nbr1> 0 && nbr2 > 0) || (nbr1 < 0 && nbr2 < 0)){
            System.out.println(" leur produit est positif ");
        } else if ((nbr1 < 0 && nbr2 > 0) ||(nbr1< 0 && nbr2 > 0)) {
            System.out.println(" leur produit est negatif ");
        } else {
            System.out.println(" non ");


        }

        sc.close();
    }

    public static void ordreNom() {
        System.out.print("Quel est votre 1er nom? ");
        String prenom1 = sc.next();
        System.out.print("Quel est votre 2ème nom? ");
        String prenom2 = sc.next();
        System.out.print("Quel est votre 3ème nom? ");
        String prenom3 = sc.next();
        if (prenom1.compareTo(prenom2) <= 0 && prenom2.compareTo(prenom3) <= 0) {
            System.out.println("ils sont rangés  dans l’ordre alphabétique.");
        } else {
            System.out.println("ils ne sont rangés pas dans l’ordre alphabétique.");
        }

        sc.close();
    }



}
