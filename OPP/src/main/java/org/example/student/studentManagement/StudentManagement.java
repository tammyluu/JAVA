package org.example.student.studentManagement;

import org.example.student.data.Student;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
     saveAStudent();
        //inputAStudent();
    }
    public  static void saveAStudent(){
        Student s1= new Student("SE666868", "Lolo Lily", 1988, 6.8);
        Student s2 = new Student("SE662204", "Toto Tata", 2004, 0.4);
        s1.showProfile();
        s2.showProfile();
        //display when private & public objectVariable(.)
        System.out.println("******* Check the public/private variable *******");
        //lolo.name; => not a statement ,# a variable, name is a variable; it's to be used . EX: String l = lolo.name

        String l = s1.name; //allow to work with variable name direct
        System.out.println("s1 name is:  " + l);
        System.out.println("s1 name is:  " +s1.name);
        s1.getName();// call function but not print
        System.out.println("s1 name is:  " +s1.getName());

//        s1.name = "New LOLO";// modify direct by variable
//        s1.setName("Cày RANK kg cày CODE"); // modify by function
        s2.name = "Change name for s2";
        System.out.println("After set s1: " );
        s1.showProfile();
        s2.showProfile();
        System.out.println( "s1 yob: " + s1.yob);
        System.out.println( "s2 yob: " + s2.yob);
        System.out.println( "s1 name: " + s1.name);
        System.out.println( "s2 name: " + s2.name);
        s1.sayHi();
        Student.sayHi();
    }
    public  static void inputAStudent(){
        String id, name;
        int yob;
        double gpa;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        // input String before number de kg bi trôi lênh
        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = sc.nextInt();
        System.out.print("Input:gpa ");
        gpa = sc.nextDouble();
        // truyen vao constructor
        Student student = new Student(id, name, yob, gpa);
        student.showProfile();
    }

}
