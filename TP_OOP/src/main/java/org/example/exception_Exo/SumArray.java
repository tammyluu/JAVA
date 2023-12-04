package org.example.exception_Exo;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int [6];
        int sum = 0;
        try {
            System.out.println(" Entrer les élement du tableau : ");
            for (int i = 0; i < arr.length ; i++) {
                try {
                    arr[i] = Integer.parseInt(sc.next());
                    sum += arr[i];
                }catch (NumberFormatException e){
                    System.out.println(" erreur: l'élément n° " + (i+1)+ " n'est pas un nombre valide ");
                    i--;
                }

            }
            if(sum == 0 ){
                System.out.println(" Erreur : le tab est vide ou vous n'avez saisie quedes 0 !!!");
            }else {
                System.out.println(" La somme de mon tableau est de : " + sum);
            }

        }catch (Exception e){
            System.out.println("Erreur : Impossible de lire à partir de la console "+ e.getMessage());
        }
        for (int n: arr
             ) {
            System.out.print(n + " ");
        }


    }

}
