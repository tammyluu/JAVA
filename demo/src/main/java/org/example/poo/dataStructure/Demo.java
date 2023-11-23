package org.example.poo.dataStructure;

public class Demo {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.setCouleur("bleu");
        electricCar.setNbrRoue(5);

        MotoCycle motoCycle = new MotoCycle();
        motoCycle.setCouleur("rouge");
        motoCycle.setNbrRoue(2);

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setCouleur("gris");
        petrolCar.setNbrRoue(4);

        SuperCar superCar = new SuperCar();

        Engine[] engines = {electricCar, motoCycle, petrolCar};
        /*for (Engine engine : engines
        ) {
            moveVehicle(engine);
        }*/

        Vehicle[] vehicles = {superCar, electricCar, motoCycle, petrolCar};
        for (Vehicle engine: vehicles
             ) {
            moveVehicle(engine);
        }

    }

    /*public static void  moveVehicle(Engine engine){
        if (engine instanceof  ElectricCar) {
            System.out.println("Electric");
            ((ElectricCar) engine).drive();// engine: dans enfant qui hérite méthode drive()
        } else if (engine instanceof  MotoCycle) {
            System.out.println("MotoCycle");
            ((MotoCycle) engine).drive(); // cast : préciser le type est MotoCycle
        } else if (engine instanceof PetrolCar) {
            System.out.println("PetrolCar");
            ((PetrolCar) engine).drive();

        }
    }*/
    public static void moveVehicle(Vehicle engine) {
        if (engine instanceof ElectricCar) {
            System.out.println("Electric");
            engine.drive();// engine: dans enfant qui hérite méthode drive()
        } else if (engine instanceof MotoCycle) {
            System.out.println("MotoCycle");
            engine.drive(); // cast : préciser le type est MotoCycle
        } else if (engine instanceof PetrolCar) {
            System.out.println("PetrolCar");
            engine.drive();

        } else if (engine instanceof SuperCar) {
            System.out.println("SuperCar");
            engine.drive();
        }
    }
}