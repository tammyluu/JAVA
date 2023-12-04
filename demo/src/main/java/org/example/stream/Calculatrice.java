package org.example.stream;

public class Calculatrice {

    public  static  double addition (double a, double b){
        return  a + b;
    }
    public  static  double soustraction (double a, double b){
        return  a - b;
    }
    public static double multiplication(double a, double b){
        return  a * b;
    }
    public static double calcule(double a, double b,  MethodeCalcule methode){
      return methode.run(a,b);
    }

}
