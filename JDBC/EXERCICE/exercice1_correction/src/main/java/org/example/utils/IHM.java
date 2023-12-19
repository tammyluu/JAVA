package org.example.utils;

import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    public IHM() {
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        String choix;
        do {
            menu();
            choix = scanner.nextLine();
            switch (choix){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "0":
                    break;
            }

        }while (!choix.equals("0"));
    }
}
