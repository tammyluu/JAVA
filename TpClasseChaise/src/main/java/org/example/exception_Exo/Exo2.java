package org.example.exception_Exo;

public class Exo2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]= 0;
        arr[1]= 5;
        arr[2]= 10;
        arr[3]= 15;
        arr[4]=20 ;

       try {
           for (int i = 0; i < 6; i++) {
               System.out.print(arr[i] + " ");
           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("\nYour error: " + e.getMessage());
       }
        System.out.println(" Let Try again your loop !!! ");
    }
}
