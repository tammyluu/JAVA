package org.example.inheritance.ParentsChildV2;

import org.example.inheritance.ParentsChildV2.data.Child;
import org.example.inheritance.ParentsChildV2.data.Parents;

public class Craftsman {
    public static void main(String[] args) {
        playWithParentsChild();
    }
    public static void playWithParentsChild(){
        Parents p = new Parents("Villa", "1000 BITCOINS");
        p.showProfile();

        Child c1 = new Child("Maison", "1000 ETH", "Audi");
        c1.showProfile(); // affichage de parents s'il n'y pas @override
        c1.sayHi();

        Parents child = new Child("Appartement" , "Actions", "Car");
        child.showProfile();
        // DRIFT by CAST
        //Child tmp = new Child() any
        /*Child tmp = (Child) child;
        tmp.sayHi();*/
        ((Child )child).sayHi();

    }

}
