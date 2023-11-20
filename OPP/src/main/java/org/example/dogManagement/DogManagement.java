package org.example.dogManagement;

import org.example.data.Dog;

public class DogManagement {
    public static void main(String[] args) {
        Dog chiHu = new Dog("CHI HU", 2021, 0.5);
        Dog berger = new Dog("Berger", 2020, 10.5);
        chiHu.bark();
        berger.bark();
    }
}
