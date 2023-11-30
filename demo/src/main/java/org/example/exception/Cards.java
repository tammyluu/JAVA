package org.example.exception;

import java.util.ArrayList;

public class Cards {
    private ArrayList<String> cards = new ArrayList<>();

    public ArrayList<String> draw(int nbCards) throws MyException {
        if (nbCards > 4){
            throw new MyException("Tricheur !!!!");
        }
        return new ArrayList<String>();
    }
    public String trade(int nbCards){
        if(nbCards > 2 ){
            throw new RuntimeException("Moins de 2 cartes !!!!");
        }
        return "Voila vos cartes!!";
    }
}
