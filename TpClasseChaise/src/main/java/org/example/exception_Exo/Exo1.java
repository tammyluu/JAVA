package org.example.exception_Exo;

import java.util.Scanner;

public class Exo1 {

    public static void main(String[] args) {
        String validStr = "123";
        String invalidStr = "123x";
        Integer number;
        try {
            number = Integer.valueOf(validStr);
            System.out.println("Converted to interger:" + number);
            number = Integer.valueOf(invalidStr);
            System.out.println("Converted to interger:" + number);
        }catch (NumberFormatException e){
            System.out.println("Message error: " + e.getMessage());
        }
        System.out.println("Program at the end !!!");
    }

}
