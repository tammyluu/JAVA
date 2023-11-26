package org.example.dogManagement;

import org.example.data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        Dog chiHu = new Dog("CHI HU", 2021, 0.5);
        //chiHu is a variable pointer,
        // new Dog is a variable object include an area of Ram memory,
        // Ram conclude reference "New". At a beginning byte of Encapulation of "New". => Reference of  Variable is reference all Ram's area of Obj
        // This area has 2 parts, 1 is a pointer who has a address memory reference,
        Dog berger = new Dog("Berger", 2020, 10.5);
        chiHu.bark();
        berger.bark();
        int a = 60;
        System.out.println("a : " + a);
        a = 70;
        System.out.println("a again : " + a);


        //appelle get() set() contacter avec obj quand ils ont de infos
        int chYeaOfBirth = chiHu.getYearOfBirth();
        System.out.println(" Chi HU year of birth : " + chYeaOfBirth);
         chiHu.setWeight(5.0);
        System.out.println("Chi Hu over weight : "  );
        chiHu.bark();
        berger.bark();
        // toString is a special function to show all infos de constructor, or modifier
        System.out.println("Show all info by using toString(): - a new behavior:" );
        String chiHudetails = chiHu.toString();
        System.out.println("Chi hu details : " + chiHudetails);
        System.out.println("Berger details : " + berger.toString());
        System.out.println("------Play with toString()----------- ");
        System.out.println(chiHu); //chiHu is obj var, save New reference => address memory, but it call method toString to print
        int b = 100;
        System.out.printf("b: %d\n", b);
        System.out.printf("b address Ram: "+ b);

    }
}
