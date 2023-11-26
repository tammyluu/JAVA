package org.example.object.main;

import org.example.object.data.Student;

public class Stage {
    public static void main(String[] args) {
        Student student = new Student("SN666789", "Toto Tata", 1999, 8.9);
        // student is obj variable,          =              object, complex
        // also is a reference variable                     instance
        // which is saved by an address of new Student      1. clone a ram area from template(constructor) -> static is got a private area
        //                                                  2. calling Constructor from this clone area, full infos => obj
        //                                                  3. refactory address memory of new area, take this address for whom to be save
        //                                                  is a obj who has this address
        student.showProfile();
    }
}
