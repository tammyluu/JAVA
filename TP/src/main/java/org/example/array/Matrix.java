package org.example.array;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    //Déterminer la valeur plus élévée de la matrice
    public static Scanner sc = new Scanner(System.in);

    public static void exo8_1() {
        int[][] matrix = {{45, 23, 34, 56, 30}, {67, 75, 21, 52, 59}, {89, 34, 19, 19, 15}, {1, 78, 90, 48, 42}};
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];

                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("La valeur plus élévée dans cette matrice est : " + max);
    }

    public static void exo8_2() {
        int count = 1;
        int sum = 0;
        long product = 1L;
        double average = 0;
        int[][] tab = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tab[i][j] = count;
                ++count;
                //System.out.print("tab[" + i + "]["+ j + "] = ");
                sum += tab[i][j];
                product *= tab[i][j];
                average = sum / tab[i][j];


            }
            System.out.println(Arrays.toString(tab[i]) + "\t");

        }
        System.out.println(" Somme de cette matrice est :" + sum);
        System.out.println(" Produit de cette matrice est :" + product);
        System.out.println(" Produit de cette matrice est :" + average);


    }

    public static void exo8_3() {
        System.out.print("Saisissez nombre  de série de véhicule par leurs marques: ");
        int m = sc.nextInt();
        System.out.print("Saisissez nombre  de vendeurs: ");
        int n = sc.nextInt();

       int [][] tab = new int [m][n]; // column, row
       String nom;
       String vehicule;
       String [][] infos = new String [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j >0) {
                    System.out.print("Saisissez le série de véhicule par leurs marques" + (i + 1) + ": ");
                    infos[i][0] = sc.next();
                }else if (j == 0 && i > 0) {
                    System.out.print("Saisissez nom  de vendeur:" + (i + 1) + ": ");
                    infos[i][1] = sc.next();
                }

            }




        }
        int vehiculIndex = 1;
        for (String[] info : infos
             ) {
            System.out.println( );

        }

        System.out.println("nombre de voituire vendu:  ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("tab[" + i + "]["+ j + "] = ");
                tab[i][j] = sc.nextInt();
            }
           System.out.println(Arrays.toString(tab[i]) + "\t");
        }



        }
    }
