package org.example.inheritance.CrarftsmanV2.data;

// Square "is a Rectangle"  => inheritance, Square is a kind of/version of Rectangle
//reuse
public class Square extends Rectangle {

    public Square(String owner, String color, double edge) {
        super(owner, color,edge,edge);
    }
    @Override
    public void  paint(){
        // ex : 90.5 = 4 espaces ~ %4 dont 1 décimal ~ .1
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f|  - |%7.2f|\n", owner,color,width,getArea());

    }
}
