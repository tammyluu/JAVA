package org.example.input_int_before_string;

import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        inputProfile();
    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("input name : ");
        name = sc.nextLine().toUpperCase();

        System.out.print("input year of birth : ");
        yob = Integer.parseInt(sc.nextLine());
        /*yob = sc.nextInt();
        //delet garbage in Buffer before enter Input a String # fflush(standard input stdin)
        // ADP solution, use nextLine() to get all infos at Buffer (with enter too)
        sc.nextLine();*/
        System.out.print("input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("\n--------Your profile -------------");
        System.out.println("Your name: "+ name);
        System.out.println("Your yob: "+yob);
        System.out.println("Your address: "+ address);
        System.out.println("-------End of your profile---------");
    }
}
