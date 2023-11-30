package org.example.exception;

public class Main {
    public static void main(String[] args)  {
        //SimpleExemple.main();
        Cards cards = new Cards();
        cards.trade(1);
        try {
        cards.draw(2);

        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de programme !!!!!");
    }
}
