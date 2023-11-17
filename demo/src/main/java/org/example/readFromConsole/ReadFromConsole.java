package org.example.readFromConsole;

import java.util.Scanner;

public class ReadFromConsole {

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
