package org.example.poo.statics;

public class Employee  extends User{
    public Employee() {
    }
    public Employee(String toto) {
        super(toto);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
