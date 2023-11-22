package org.example.dogManagement;

import org.example.data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        Dog chiHu = new Dog("CHI HU", 2021, 0.5);
        Dog berger = new Dog("Berger", 2020, 10.5);
        chiHu.bark();
        berger.bark();
        int a = 60;
        System.out.println("a : " + a);
        System.out.println("a again : " + a);
        a = 70;

        //appelle get() set() contacter avec obj quand ils ont de infos
        int chYeaOfBirth = chiHu.getYearOfBirth();
        System.out.println(" Chi HU year of birth : " + chYeaOfBirth);
         chiHu.setWeight(5.0);
        System.out.println("Chi Hu over weight : "  );
        chiHu.bark();
        berger.bark();
    }
}
