package org.example.object.main;

import org.example.object.data.Student;

public class Stage {
    public static void main(String[] args) {
        //checkObjectV1();
        //checkObjectV2();
        //checkObjectV3();
        //checkObjectV4();
       // checkObjectV5();
        Student x = checkObjectV7();
        x.setName("I want to check again");
        x.showProfile();
        checkObjectV7().showProfile();
    }
    // to check "new" which is the same data => what will happen?
    public static  void checkObjectV1 (){
        Student s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);

        Student s2 = new Student("SN666789", "Toto Tata", 1999, 8.9);
        s1.showProfile();
        s2.showProfile();

        //Justify 2 new are 2 obj different, 2 clone area Ram different although same data
        s1.setName("Faire la tête, ne pas vouloir apprendre");
        s2.showProfile();//Toto
        s1.showProfile();//Faire la tête, ne pas vouloir apprendre
        System.out.println("------ Check duplication if any? ---------- ");
        System.out.println(s1);
        System.out.println(s2);

    }
    //loose reference, loose new area mất tọa độ, mất dấu vùng new
    //Variable co quyền thay đổi chỗ trỏ
    public static  void checkObjectV2 (){
        Student s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);
        // s1 is a pointer
        Student s2 = new Student("SN666789", "Toto Tata", 1999, 8.9);

        s1 = new Student("SN666789", "Tutu Titi", 1999, 8.9);
        s1.showProfile();
        // muốn lấy lại vùng clone Toto . Khi 1 object kg có ai trỏ tới (mất con trỏ)gán qua vùng new mới , thì bị mất tọa độ vùng new cũ
        //con trỏ gán qua vùng new mới, mất dấu vùng new cũ
        //JVM chạy bên windows, bộ phận giám sát vùng ram viết app= java is called GARBAGE COLLECTOR , clear availble cho new clone khac
        // việc Clear Ram "Heap" của Java diễn ra định kỳ, trong bao nhiêu s/minutes, .....;
        // we can use direct a methode
        System.gc();

    }
    public static  void checkObjectV3 (){
        Student s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);
        System.out.println("address memory initial: " +s1);
        //Trước khi chơi với tutu mà kg muốn mất An
        // cần phải ghi ra tọa đọ đâu đó của vùng new của toto
        Student x = s1; // x trỏ đến Toto
        // int a = 10;
        // int b = a; a có giá trị gì sẽ cho b giá trị đó -> gán giá trị 2 biến cho nhau
        s1.setName("Justify");
        System.out.println("\naddress memory after affect a new pointer: "+ x);

        s1 = new Student("SN666789", "Tutu Titi", 1999, 8.9);
        //s1 bây giờ trỏ đến tutu
        // x là toto trước đó
        s1.showProfile();
        System.out.println("\naddress memory after new clone: " + s1);
        x.showProfile();
        System.out.println("\naddress memory at the end : " + x);
    }
    // 2 pointers at an object
    public static  void checkObjectV4 (){
        Student s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);
        Student s2 = s1; // 2 pointers have a same address memory, same reference
        s1.setName("Lady GAGA");
        s2.showProfile();
        s1.showProfile();

    }
    //  anonymous object = object no name
    public static  void checkObjectV5 (){
        //Student s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);
        new Student("SN666789", "Toto Tata", 1999, 8.9).showProfile();
        // no have a pointer, is called one time so garbage collector remove

    }
    // declarer un  variable avant affecter une veleur
    public static  void checkObjectV6 (){
        Student s1;
         s1 = new Student("SN666789", "Toto Tata", 1999, 8.9);
         s1.showProfile();
    }
    //function return an object, no primitive type
    // this function was returned reference of object which is "new"
    public static  Student checkObjectV7 (){

        Student s1 = new Student("SN666789", "checkObjectV7", 1999, 8.9);
        return  s1;
    }
    public static void checkObject() {
        Student student = new Student("SN666789", "Toto Tata", 1999, 8.9);
        // student is obj variable,          =              object, complex
        // also is a reference variable                     instance
        // which is saved by an address of new Student      1. clone a ram area from template(constructor) -> static is got a private area
        //                                                  2. calling Constructor from this clone area, full infos => obj
        //                                                  3. refactory address memory of new area, take this address for whom to be save
        //                                                  is a obj who has this address
        student.showProfile();
        student = new Student("SN666999", "Newtoto Newtata", 2000, 9.8);
        student.showProfile();
        new Student("SN777343", "Current Tata", 2005, 7.7).showProfile();
    }
}
