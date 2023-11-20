package org.example.string;

import java.util.Arrays;

public class ChaineCharactere {

    public static void getMethodeString(){
        System.out.println("-------------Les chaine des caracteres--");
        String s = " hello ";
        System.out.println("s.length(): " + s.length() );
        System.out.println("s.contains(\"he\"): " + s.contains("he") );
        System.out.println("s.isEmpty(): " + s.isEmpty());
        System.out.println("s.toUpperCase(): " +s.toUpperCase() );
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h") );
        System.out.println("s.s.endsWith(\" \"): " + s.endsWith(" "));
        System.out.println("s.replace(\"ll\",\"LL\"): " + s.replace("ll","LL") );
        System.out.println("s.trim(): " + s.trim() ); //hello
        System.out.println("s.substring(0,3)::" +  s.substring(0,3));
        System.out.println("s.charAt(1)" +  s.charAt(1));
        System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e")));
        System.out.println("Arrays.toString(s.split(\"l\")): " + Arrays.toString(s.split("l")));

        System.out.println(s);


}

    public static void getCompareString() {
         String s = " hello ";
         String s2 = " hello ";
        System.out.println(" s == s2 : " + (s == s2)); //true : compare string & String
        String s3 = new String(" hello ");
        System.out.println(" s == s3 : " + (s == s3));//false
        System.out.println("s.equals(s3) " + (s.equals(s3)));
       String firstName =  "Alain";
       String firstName1 =  "alain";
        System.out.println( "firstName.equals(firstName1): "+firstName.equals(firstName1)); //false
        System.out.println( "firstName.equals(firstName1): "+firstName.equalsIgnoreCase(firstName1));// true
    }

    public static void formatString() {
        System.out.println("------- Formattage des caracteres------");
        String firstNam = "Alain";
        String phrase = " Salut, cher %s !, Good %s !";
        String morning = "Morning";
        String evening = "Evening";
        String Afternoon = "Afternoon";

        String nouvellePhrase = String.format(phrase,firstNam,morning);
        System.out.println(nouvellePhrase);
        System.out.printf("Vous allez gagner %d à l'euro-millions dans %d jours", 1000000, 10 );

        String monProduit = "Chocolat";
        double prix = 2.99;
        int quantite = 10;
        // d : int, s :String, f : float
        System.out.printf("\nTotal pour %d unité %s : %.2f euros" , quantite,monProduit, prix*quantite);

        double a = 3.5, b = 1.75, c = 7.0;
        System.out.printf("\nJe divise %.1f par deux et j'obtiens %.1f, en divisant encore par deux j'obtiens %.2f.",c,a,b );

       

    }


}