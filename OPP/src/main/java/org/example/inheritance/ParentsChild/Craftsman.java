package org.example.inheritance.ParentsChild;

import org.example.inheritance.ParentsChild.data.Child;
import org.example.inheritance.ParentsChild.data.Parents;

public class Craftsman {
    public static void main(String[] args) {
        playWithParentsChild();
    }
    public static void playWithParentsChild(){
        Parents p = new Parents("Villa", "1000 BITCOINS");
        p.showProfile();

        Child c1 = new Child("Maison", "1000 ETH");
        c1.showProfile(); // affichage de parents s'il n'y pas @override
        c1.sayHi();

        Parents  child = new Child("Appartement" , "Actions");
        child.showProfile(); // no have method sayHi() => resolve? DRIFT
    }
}
