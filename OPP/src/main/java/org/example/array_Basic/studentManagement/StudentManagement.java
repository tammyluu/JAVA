package org.example.array_Basic.studentManagement;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {

        // menu choix style slow motion
        // 1. menu 2. input of choice 3. action comparative
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf shelf = new Shelf("Pink", "SE");

        do {
            printMenu();
            System.out.print("Please choose your option from 1 to 6: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1 :
                    shelf.inputAsStudent();
                    break;
                case 2 :
                    shelf.printStudentList();
                    break;
                case 3 :
                    shelf.searchStudentById();
                    break;
                case 4 :
                    shelf.updateStudentById();
                    break;
                case 5 :
                    break;
                case 6 :
                    System.out.println("You choose to quit this program!! See you next time");
                    break;
                default:
                    System.out.println("Please choose your option from 1 to 6 only !!!!");
                    break;
            }
        }while (choice != 6);





    }
    public static void printMenu(){

        System.out.println("\n******* Welcome to M2i - CDA ************");
        System.out.println("Choose the following options to play with");
        System.out.println("-----------------------------------------");
        System.out.println(" 1. Add a new student profile");
        System.out.println(" 2. Print the student list");
        System.out.println(" 3. Search the student by id");
        System.out.println(" 4. Update the student profile");
        System.out.println(" 5. Remove a student profile"); // ne pas supprimer, mettre inactif leur profile
        System.out.println(" 6. QUIT");
        System.out.println("-----------------------------------------\n");


    }
}
