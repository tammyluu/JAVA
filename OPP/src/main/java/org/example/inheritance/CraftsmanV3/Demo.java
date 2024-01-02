package org.example.inheritance.CraftsmanV3;

import org.example.inheritance.CraftsmanV3.data.RightTriangle;
import org.example.inheritance.CraftsmanV3.data.Triangle;

public class Demo {
    public static void main(String[] args) {
        saveTriangle();
    }
    public static void saveTriangle(){
        // declarer parents new parents => concrete class : classe précise
        Triangle[] triangles = new Triangle[4];
        triangles[0] = new Triangle("Daddy", 2.0, 2.0, 3.0);
        triangles[1]= new Triangle("Mommy", 3.0, 3.0, 4.0);
        triangles[2]= new Triangle("Son", 4.0, 2.0, 3.0);
        // declarer enfant new enfant
        RightTriangle rt = new RightTriangle("Child", 6.0, 8.0);
        rt.paint();
        // declarer parents new enfant
        triangles[3] = new RightTriangle("Daughter", 3.0, 4.0 );

        for (Triangle t: triangles
             ) {
            t.paint();
        }

    }
    public static void sortSuperficialTriangle(){

    }
}
