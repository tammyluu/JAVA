package org.example.array_Basic.studentManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Shelf {
    private String color;
    private String label ;
    // but d'ajouter un student dans le tableau est plus important
    private Student[] listStudent = new Student[30];
    private Scanner sc = new Scanner(System.in);
    // default for count (ne pas mettre dans constructor)
    private  int  count = 0;

    // Qui a plus espace d'infos, il va s'occuper input, output

    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;

    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Student[] getListStudent() {
        return listStudent;
    }

    public void setListStudent(Student[] listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "color='" + color + '\'' +
                ", label='" + label + '\'' +
                ", arr=" + Arrays.toString(listStudent) +
                '}';
    }

    public void inputAsStudent () {

        int yob;
        String id, name;
        double gpa;

            System.out.println("Input student #" + (count+ 1) + "/" + listStudent.length);
            System.out.print(" Input id : ");
            id = sc.nextLine();

            System.out.print(" Input name : ");
            name = sc.nextLine();

            System.out.print(" Input yob : ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print(" Input GPA : ");
            gpa = Double.parseDouble(sc.nextLine());
            // ajouter un student dans la liste
            listStudent[count] = new Student(id,name,yob,gpa);
            // count parcourir : s'appeller "slow motion ",
            count++; // il y a un student va ajouter
        System.out.println("Add A new student successfully!");
        }
        public void printStudentList(){
            System.out.println(" \nThere is/are " + count + " student(s) in the list(s) ");
            for (int i = 0; i < count; i++) {
                listStudent[i].showProfile();
            }
        }

        public void searchStudentById(){
        String id;
            System.out.print("Input id that you want to search: ");
            id = sc.nextLine();
            for (int i = 0; i < count ; i++) {
                //equal car on veut savoir il existe ou non, pas comparer leur values
                //  => listStudent[i].getId().equalsIgnoreCase(id) == true
                if (listStudent[i].getId().equalsIgnoreCase(id)) {
                    System.out.println("Student found !!!! His/Her profile is : ");
                    listStudent[i].showProfile();
                    return; // aider to finir  for et function
                }
            }
            System.out.println("\t!!!!!Not found");
        }
    public void updateStudentById(){
        String id;
        System.out.print("Input id that you want to search: ");
        id = sc.nextLine();
        double gpa;
        for (int i = 0; i < count ; i++) {
            //equal car on veut savoir il existe ou non, pas comparer leur values
            //  => listStudent[i].getId().equalsIgnoreCase(id) == true
            if (listStudent[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Student found !!!! His/Her profile is : ");
                listStudent[i].showProfile();
                System.out.print(" Reset her GPA : ");
                gpa = Double.parseDouble(sc.nextLine());
                listStudent[i].setJpa(gpa);
                System.out.println(" ==> Your gpa is update!!");
                return; // aider to terminer for et function
            }
        }
        System.out.println("\t!!!!!Not found");
    }



}
