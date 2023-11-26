package org.example.student.data;

public class Student {
    private static String id;
   // private String name;
   public static String name;
    //private  int yob;
    public int yob;
    private double gpa; //grade point average = moyenne

    public Student() {
    }

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }
 // never set id, beacause it influence all object
   /* public void setId(String id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-20s|%4d|%4.1f|", id, name, yob,gpa);
    }
    public void  showProfile(){
        System.out.printf("|%8s|%-20s|%4d|%4.1f|\n", id, name, yob,gpa);
        System.out.println("By the way, my year of birth is: " + yob);
    }
    public int getAge(){
        return 2023 - yob;
    }
    public static void  sayHi(){
        System.out.println("Hi everyone, My name is: " + name);
        //System.out.println("By the way, my year of birth is: " + yob);
        //yob is undefined, is not at the same area Ram of Static, it don't know which yob to be called because there are many yob
    }

}
