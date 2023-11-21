package org.example.array;

import java.util.Arrays;

public class ArrayMatrix {
    static int [][] matrix = {{1,2,4},{23,89,145,78},{4,9}};

    public static void getMatrix() {
       // System.out.println(matrix[0][2]);
       /* [1  2  4     ]
          [23 89 145 78]
          [4  9        ]*/

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                //parcourir tout le tableau
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void getMatrix2() {
        int [][] tab = new int[3][4];
        for (int i = 0; i < tab.length ; i++) {
            for (int j = 0; j < tab[i].length ; j++) {
                //parcourir tout le tableau

                tab[i][j] = i*j;

            }
            System.out.println(Arrays.toString(tab[i]));
        }
    }

}
