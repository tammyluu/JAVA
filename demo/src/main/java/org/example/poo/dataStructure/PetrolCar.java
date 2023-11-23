package org.example.poo.dataStructure;

public class PetrolCar extends Engine implements Vehicle{

    public PetrolCar() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }

    public PetrolCar(int id, int nbrRoue, String couleur) {
        super(id, nbrRoue, couleur);
    }

    @Override
    public void drive() {
        System.out.println("I'am a SuperCar who run");
    }

    @Override
    public void startEngine() {
        System.out.println("I'm Starting");
    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "id=" + id +
                ", nbrRoue=" + nbrRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
