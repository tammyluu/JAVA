package org.example.readFromConsole;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("entrer un nombre entier: ");
        int num = sc.nextInt();
        System.out.println("Nombre  saisie : "+ num);
        System.out.print("Donne moi un chain: ");

        sc.nextLine();

        String str = sc.nextLine();
        System.out.println("Chain saisie : "+ str);

    }

    public static void getReadWrite() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donne moi un nom: ");
        String  nom = sc.next(); //đọc một từ hoặc một chuỗi từ đầu vào cho đến khi gặp một khoảng trắng hoặc ký tự trắng khác.
        System.out.println("La nom de saisir est " + nom);
        System.out.print("Donne moi un nombre : ");
        Integer  nombre = sc.nextInt();
        System.out.println("La nombre de saisir est " + nombre);

    }
}
