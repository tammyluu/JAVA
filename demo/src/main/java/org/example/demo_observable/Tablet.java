package org.example.demo_observable;

public class Tablet  implements  IObserver{
    @Override
    public void update(Weather weather) {
        System.out.println("Tablet with weather information "+weather.getTemperature());
    }
    }

