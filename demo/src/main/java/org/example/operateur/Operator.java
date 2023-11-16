package org.example.operateur;

import java.util.Arrays;
import org.example.model.Maison;

public class Operator {
    public static void getOperation() {

        System.out.println("********* Les opérateurs ******");
        int i = 10;
         int i2 = -10;
         int i3 = ++i; // 11
        System.out.println(" i3: " + i3);
         int i4 =  i++; // 11
        System.out.println(" i4: " + i4);
         int i5 = i; //12
        System.out.println(" i5: " + i5);
        int i6 = --i; // 11
        System.out.println(" i6: " + i6);
        int i7 = i--; // 11
        System.out.println(" i7: " + i7);
        int i8 = i ; //10
    }
    public static void getExpression(){
        byte b = 1;
        short s = 1;
        int i = 1;
         long l = 1L;
         float f = 1.0f;
         double d = 1.0;
         char c = 1;

         int express = b+b;
         int express2 = b+s;
         int express3 =  b+i+s;
         double express4 = l +i;
         float express5 = l+f;
         double express6 = d+f;


         int t = 2_000_887_697;
         int t2 = 2_000_887_697;

         int total = t + t2;
        System.out.println("la valeur de total : " + total);


    }
    public static void getOperatorComparaison(){
        int int1 = 128;
        int int2 = 128;

        System.out.println("int1==int2 "+ (int1 == int2));

        Integer int3 = 128; //  car il sort de {-128; 127} =>compare l'espace mémoire
        Integer int4 = 128;

        System.out.println("int3==int4 "+ (int3 == int4));

        Integer int5 = 127; //car il est dans {-128; 127} => compare les valeur
        Integer int6 = 127;

        System.out.println("int5==int6 "+ (int5 == int6));

        Integer int7 = new Integer(127); //car il est créer un Objet => compare l'adresse de mémoire
        Integer int8 = new Integer(127);

        System.out.println("int7 == int8 "+ (int7 == int8));

        Integer int9 = Integer.valueOf(127);
        Integer int10 = Integer.valueOf(127);

        System.out.println("int7 == int8 "+ (int9 == int10));
        System.out.println("int3 equal int4 "+ (int3.equals(int10))); // pour dire que je veux comparaision valeur

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        System.out.println("arr1 == arr2 " + (arr1 == arr2));
        System.out.println("arr1 equals arr2 " + (arr1.equals(arr2)));
        System.out.println("Arrays " + (Arrays.equals(arr1,arr2)));

        arr1 = arr2;
        System.out.println("arr1 == arr2 " + (arr1 == arr2));

        Maison maison  = new Maison("maison", 5);
        Maison maison1  = new Maison("maison", 5);

        System.out.println("maison == maison1 " + (maison == maison1));
        System.out.println("maison.nom == maison1.nom " + (maison.nom == maison1.nom));


    }


}
