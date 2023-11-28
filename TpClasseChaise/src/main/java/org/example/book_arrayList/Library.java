package org.example.book_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {



    public static void main(String[] args) {
      //addBook();
      deleteBookById();
    }

    public static void addBook() {
        ArrayList<String> books = new ArrayList<>();
        books.add("English");
        books.add("Maths");
        books.add("Physical");
        books.add("Chimical");
        System.out.println(books);
    }
    public static void deleteBookById (){
        ArrayList<String> books = new ArrayList<>();
        addBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un id de livre: ");
        int iID = sc.nextInt();
        for (int i = 0; i < books.size() ; i++) {
            if (i == iID) {
                System.out.println(books.get(i));
                books.remove(books.get(i));
                System.out.println("\tCe livre avec id "+ i +" a été supprimé !!! ");
            }
        }
    }



    }



