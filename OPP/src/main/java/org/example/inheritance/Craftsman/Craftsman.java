package org.example.inheritance.Craftsman;

import org.example.inheritance.Craftsman.data.Disk;
import org.example.inheritance.Craftsman.data.Rectangle;
import org.example.inheritance.Craftsman.data.Square;

public class Craftsman {
    public static void main(String[] args) {
        //cutShape();
        sortShapes();
    }
    public static void  cutShape(){
        Rectangle r1 = new Rectangle("Toto","Red",1.0,2.0);
        r1.paint();
        Square s1 = new Square("Tata","Pink", 3.0);
        s1.paint();

        Disk d1 = new Disk("Titi","Blue",":)",2.0);
        d1.paint();
    }
    public static void sortShapes(){
        Rectangle r1 = new Rectangle("Father","Blue",1.0,2.0);
        Rectangle [] rectArray = new Rectangle[9];
        rectArray[0] = r1;
        rectArray[1] = new Rectangle("Mother","Pink",2.0,3.0);
        rectArray[2] = new Rectangle("Children","Yellow",2.0,2.0);
        //rectArray[3] = new Square("Sibling","Yellow",2.0); -> false pas même de type
        System.out.println("---------Array before sorting------- ");
        // not for each because array is not full
        for (int i = 0; i <3 ; i++) {
            rectArray[i].paint();
        }
        System.out.println("---------After sorting------------ ");
        for (int i = 0; i < 3-1 ; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArray[i].getArea() > rectArray[j].getArea()){
                    Rectangle t = rectArray[i];
                    rectArray[i] = rectArray[j];
                    rectArray[j] = t;
                }
            }
        }
        for (int i = 0; i <3 ; i++) {
            rectArray[i].paint();
        }
    }
}
