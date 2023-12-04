package org.example.array_Basic.studentManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Shelf {
    private String color;
    private double price;
    private Student[] arr;

    public Shelf(String color, double price, Student[] arr) {
        this.color = color;
        this.price = price;
        this.arr = arr;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Student[] getArr() {
        return arr;
    }

    public void setArr(Student[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
    public  void inputStudentList () {
        Scanner sc = new Scanner(System.in);
        int yob, count;
        String id, name;
        double gpa;
        System.out.println("How many student do you want to input? ");
        count = Integer.parseInt(sc.nextLine());// Mytoys.get...()
        org.example.array_Basic.Student[] arr = new org.example.array_Basic.Student[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.println(" Input id : ");
            id = sc.nextLine();

            System.out.println(" Input name : ");
            name = sc.nextLine();
            System.out.println(" Input yob : ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.println(" Input GPA : ");
            gpa = Double.parseDouble(sc.nextLine());
            arr[i] = new org.example.array_Basic.Student(id, name, yob, gpa);
        }
        System.out.println(" The student list ");
        for (org.example.array_Basic.Student s : arr) {
            s.showProfile();
        }
    }
}
