package org.example.billetterie.classes;


import org.example.billetterie.utils.InputManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceManagement {
    private ArrayList<Lieu> lieuList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addNewTheater(){
        String iName,iAddress;
        int position, iCapacity;
        do{
            iName = InputManagement.getString("Entrez le nom d'un lieu: ", "Nom de lieu est obligatoire!!");
            position = findTheaterByName(iName);
            if (position >= 0){
                System.out.println(" The theater is exists. Try to input again!!!");
            }
        } while (position!=-1);

        iAddress = InputManagement.getString("Entrez l'adresse' d'un lieu: ","Adresse de lieu est obligatoire!!");

        iCapacity= InputManagement.getAnInteger("Entrez le capacité d'un lieu: ","Capacité de ce lieu est obligatoire!!");

        // add
        lieuList.add(new Lieu(iName, iAddress,iCapacity));
        System.out.println("Ce lieu ajouté");


    }
    public int findTheaterByName( String name){

        if (lieuList.isEmpty() ) {
            return -1;
        }
        for (int i = 0; true; i++) {
            if (lieuList.get(i).getName().equalsIgnoreCase(name));
            return i;
        }
    }
}
