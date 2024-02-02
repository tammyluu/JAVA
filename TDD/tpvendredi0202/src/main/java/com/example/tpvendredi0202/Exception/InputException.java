package com.example.tpvendredi0202.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class InputException {

        private static Scanner sc = new Scanner(System.in);
        // Input a string not empty
        public static String getString(String inputMsg, String errorMsg) {
            String inputString;
            while (true) {
                System.out.print(inputMsg);
                inputString = sc.nextLine().trim().toUpperCase();
                if (inputString.isEmpty())
                    System.out.println(errorMsg);
                else
                    return inputString;
            }
        }





        public static boolean getBoolean(String inputMsg, String errorMsg) {
            while (true) {
                try {
                    System.out.print(inputMsg);
                    String userInput = sc.nextLine().trim().toLowerCase();

                    if (userInput.equals("true") || userInput.equals("false")) {
                        return Boolean.parseBoolean(userInput);
                    } else {
                        System.out.println(errorMsg);
                    }

                } catch (Exception e) {
                    System.out.println(errorMsg);
                }
            }
        }



        public static void main(String[] args) {
       /* String inputString = getString("Entrez le nom  en format chaîne de caractères: ", "Veuillez entrer un nom  valide!");
        System.out.println("Vous avez saisi :  " + inputString);
*/

        }


}
