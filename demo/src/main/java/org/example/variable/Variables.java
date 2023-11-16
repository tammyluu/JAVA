package org.example.variable;

public class Variables {

    public static void getVariable(){
        byte  b = 'A';
        b = 127;
        System.out.println("Valeur de b : " + b );
        short s;
        s =2000;
        int i = 12345678;
        long l = 5L;
        char c = 'h';
        boolean  bool = true;
        float f = 1.5888f;
        double  doub = 5.2121212;
        i = s;
        char c4 = (char) 69000;
        char c5 = 65000;
        System.out.println("la valeur de c4: " + c4);
        System.out.println("la valeur de c5: " + c5);

        int i3 = 545454545;
        System.out.println("i3 : " + i3);
        b= (byte) i3;
        System.out.println(" b après cast : " +b);


    }
}
