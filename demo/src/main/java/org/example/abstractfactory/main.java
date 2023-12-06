package org.example.abstractfactory;

public class main {
    public static void main(String[] args) {

        // Application Mac
        App appMac = new App(new MacFactory());

        // Application  Win
        App appWin = new App(new WinFactory());

    }
}
