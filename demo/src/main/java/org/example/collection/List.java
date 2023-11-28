package org.example.collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        // ArrayList<type> nom de collection = new ArrayList<type>()
        ArrayList<String> prenoms = new ArrayList<String>();

        // la méthode add() permet d'ajouter des element
        prenoms.add("toto");
        prenoms.add("Titi");
        prenoms.add("Tutu");
        //prenoms.add(42); error

        // recuperer un element
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        //la methode est permet de modifier un element
        prenoms.set(1,"Tammy");
        System.out.println("Prénom a été modifié : " + prenoms.get(1));

        // remove permet de supprimer un element
        // size()  permet de return un taille de ma liste
        System.out.println("La taille de liste initiale: "+ prenoms.size());
        prenoms.remove(0);
        System.out.println( "La taille de liste après remove un élément: "+ prenoms.size());
        System.out.println("------Use Loop--------");
        // parcourrir avec la boucle for
        for (int cpt = 0; cpt < prenoms.size() ; cpt++) {
            System.out.println( "For: "+prenoms.get(cpt));
        }

        // Parcourir avec la for each
        for (String prenom:prenoms
             ) {
            System.out.println("For each: "+prenom);
        }

    }
}
