package org.example.tp_class_heritage.exo1;

public class Teacher extends  Person{
    private  String subjet;

    public Teacher(String subjet) {
        this.subjet = subjet;
    }

    public Teacher(int age) {
        super(age);
    }

    public void  explain(){
        System.out.println("Explanation begins");
    }
}
