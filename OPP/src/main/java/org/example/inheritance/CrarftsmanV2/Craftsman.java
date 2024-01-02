package org.example.inheritance.CrarftsmanV2;

import org.example.inheritance.CrarftsmanV2.data.Disk;
import org.example.inheritance.CrarftsmanV2.data.Rectangle;
import org.example.inheritance.CrarftsmanV2.data.Square;

public class Craftsman {
    public static void main(String[] args) {
        //cutShape();
        //sortShapes();
        playWithChildClass();
    }
    public static void playWithChildClass(){
        Square s1 = new Square("Daddy", "Black", 5.0);
        //           ram is new Rectangle(o,c,(,();
        s1.paint(); //iheritance all methods of Rectangle
        Rectangle r1 = new Rectangle("Mommy","PINK", 6.0, 7.0);
        r1.paint();
        Rectangle s2 = new Square("Daughter","White",5.0);
        //         rectangle   <= Square is
        s2.paint();
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
        Rectangle [] rectArray = new Rectangle[4];
        rectArray[0] = r1;
        rectArray[1] = new Rectangle("Mother","Pink",2.0,3.0);
        rectArray[2] = new Rectangle("Children","Yellow",2.0,2.0);
        /*-------------------------------------------------*/
        rectArray[3] = new Square("Sibling", "Rainbow", 2.0);
        System.out.println("---------Array before sorting------- ");
        // not for each because array is not full
        for (int i = 0; i <4 ; i++) {
            rectArray[i].paint();
        }
        System.out.println("---------After sorting------------ ");
        for (int i = 0; i < 4-1 ; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (rectArray[i].getArea() > rectArray[j].getArea()){
                    Rectangle t = rectArray[i];
                    rectArray[i] = rectArray[j];
                    rectArray[j] = t;
                }
            }
        }
        for (int i = 0; i <4 ; i++) {
            rectArray[i].paint();
        }
    }
}
