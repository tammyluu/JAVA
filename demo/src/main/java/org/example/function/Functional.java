package org.example.function;

import org.example.model.Maison;

import java.util.ArrayList;
import java.util.List;

public class Functional {
    public static void getFunction() {
        int result = sum(1, 5, 5);
        System.out.println(result);
        result = sum(5, 8);
        System.out.println(result);
        double resultat = sum(45, 98, 12547, 548, 48);
        System.out.println(resultat);
    }

    public static int sum(int i1, int i2) {
        return 0;
    }

    public static Integer sum1(int i1, int i2) {
        return null;
    }

    public static Integer sum(int i1, int i2, int i3) {
        int result = i2 + i1;
        return result;
    }

    // si on a tous même type double, mais on ne sais pas comnien variables
    public static double sum(double... doubles) {
        double result = 0;
        for (double d : doubles
        ) {
            result += d;
        }
        return result;
    }

    // ... devait déclarer en dernier
    public static double sum(String val, double... doubles) {
        double result = 0;
        for (double d : doubles
        ) {
            result += d;
        }
        return result;
    }
    public static List<Maison> sum(Maison[] val) {
        List<Maison> maisons = new ArrayList<>();
      // interface = class
        return maisons;
    }
}


