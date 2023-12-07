package org.example.demo_observable;

public class Phone implements IObserver{
    @Override
    public void update(Weather weather) {
        System.out.println("Phone with weather information "+weather.getTemperature());
    }
}
