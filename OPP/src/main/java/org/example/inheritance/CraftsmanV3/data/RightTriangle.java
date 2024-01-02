package org.example.inheritance.CraftsmanV3.data;
// Right Triangle is a triangle
public class RightTriangle extends Triangle{
    public RightTriangle(String owner, double a, double b) {
        super(owner, a, b, Math.sqrt(a * a + b * b));
    }
   /* public double getHypotenuse(){
        double c = Math.sqrt(a * a + b * b);
        return  c;
    }*/
    @Override
    public void paint(){
        System.out.printf("RIGHT-TRIANGLE|%-15s|%4.1f|%4.1f|%4.1f|%7.2f\n", owner,a,b,c, getAreaByFormuleHeron());
    }

}
