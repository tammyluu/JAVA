package org.example.array_Basic;

public class Student {
    private  String id;
    public String name; // cho xem và sửa tên trực tiep kg cần getter/setter
    private int yob;
    private  double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setJpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yob=" + yob +
                ", jpa=" + gpa +
                '}';
    }
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id,name,yob,gpa);
    }
}
