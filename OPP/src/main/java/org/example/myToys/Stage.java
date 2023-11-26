package org.example.myToys;

public class Stage {
    public static void main(String[] args) {
        System.out.println(" PI: " + MyToys.PI);
        //MyToys.PI = 4.0;
        System.out.println(" PI again : " + MyToys.PI);
        /*int width  = MyToys.getAnInteger();
        int length  = MyToys.getAnInteger();*/
        int width = MyToys.getAnInteger("Input a width: ");
        int length = MyToys.getAnInteger("Input a length: ");
        System.out.println("width: " + width);
        System.out.println("length: " + length);

    }
}
