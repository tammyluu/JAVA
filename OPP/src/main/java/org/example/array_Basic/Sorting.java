package org.example.array_Basic;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        //sortedObjectArray2();
        //sortIntegerList();
        //sortIntegerListV2();
        inputStudentList();
    }
    public static void sortIntegerList(){
        int[] arr = new int[]{-1000, 1000, 50, 30, -20, 3, -3000};
        //selection sort: put the min value at first position ( selection = chosen one)
        // step 1: choose [0] compare with the rest
        System.out.println("the array before sorting : ");
        for ( int x :arr ) {
            System.out.print(x + " ");
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]){
                int t = arr[0];
                arr[0] = arr[i];
                arr[i] = t;
            }
        }
        System.out.println("\nThe array after sorting : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]){
                int t = arr[1];
                arr[1] = arr[i];
                arr[i] = t;
            }
        }
        System.out.println("\nThe array after sorting : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
    }
    public static void sortIntegerListV2(){
        int[] arr = new int[]{-1000, 1000, 50, 30, -20, 3, -3000};
        //selection sort: put the min value at first position ( selection = chosen one)
        // step 1: choose [0] compare with the rest
        System.out.println("the array before sorting : ");
        for ( int x :arr ) {
            System.out.print(x + " ");
        }
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

        }
        System.out.println("\nThe array after sorting : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }

    }
    public static void sortedObjectArray2(){
        Student [] arr = new Student[]{
        new Student("SE234556", "Lyli lolo", 2001, 9.0),
        new Student("SE234557", "Toto titi", 2000, 5.4),
        new Student("SE234558", "Momo mama", 2005, 6.8),
        new Student("SE234559", "Fafa fifi", 2003, 8.1),
        new Student("SE234560", "Gaga gugu", 2002, 7.5),
        };
        System.out.println("Before sorting: ");

        // với mọi x thuộc tập hợp arr, x = từng phần tử, x = value từng phần tử
        for (Student x : arr  ) {
            x.showProfile();
        }
        //sorting Array Object Ascending
        System.out.println("The student list After sorting ----Ascending ---- by gpa: ");
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
           arr[i].showProfile();
        }
        System.out.println("The student list After sorting -----Descending--- by gpa: ");
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() < arr[j].getGpa()) {
                    Student tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            arr[i].showProfile();
        }
    }
    public static void inputStudentList (){
        Scanner sc = new Scanner(System.in);
        int yob, count;
        String id, name;
        double gpa;
        System.out.println("How many student do you want to input? ");
        count = Integer.parseInt(sc.nextLine());// Mytoys.get...()
        Student[] arr = new Student[count];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Input student #" + (i+1) + "/" + count);
            System.out.println(" Input id : ");
            id = sc.nextLine();
            System.out.println(" Input name : ");
            name = sc.nextLine();
            System.out.println(" Input yob : ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.println(" Input GPA : ");
            gpa = Double.parseDouble(sc.nextLine());
            arr[i]= new Student(id, name,yob,gpa);
        }
        System.out.println(" The student list ");
        for ( Student s : arr ) {
            s.showProfile();
        }


    }
}
