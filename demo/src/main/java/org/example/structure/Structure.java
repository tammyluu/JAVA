package org.example.structure;

public class Structure {
    static int int1 = 100;
    static int int2 = 200;

    public static void getIfElse() {
        if (int1 > int2){
            System.out.println("int1 > int2");
        }else {
            System.out.println("int1 < int2");
        }


    }
    public static void getIfElseIf() {
        if (int1 > int2){
            System.out.println("int1 > int2");
        }else if ( int1 == int2){
            System.out.println("int1  = int2");
        }else {
            System.out.println("int1 < int2");
        }


    }
    public static void getSwitch() {
       String val = "titi";
       switch (val){
           case "titi":
               System.out.println("C'est titi");
               break;
           case "tata":
               System.out.println("C'est tata");
               break;
           case "toto":
               System.out.println("C'est toto");
               break;
           default:
               System.out.println("y a rien");
       }


    }

}
