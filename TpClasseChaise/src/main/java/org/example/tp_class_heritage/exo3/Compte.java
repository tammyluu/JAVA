package org.example.tp_class_heritage.exo3;

public class Compte {



    protected int code;
    protected double sold;

    public Compte() {
    }

    public Compte(int code, double sold) {
        this.code = code;
        this.sold = sold;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", sold=" + sold +
                '}';
    }
}
