package org.example.demo_observable;

import lombok.Data;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Data
public class WeatherStation implements ISubject{
    private Random random = new Random();

   List<IObserver> observers;
   public WeatherStation(){
       observers =new ArrayList<>();
   }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Weather weather) {
        observers.forEach(o -> o.update(weather));
    }
    public void randomTemperature()  {
       notifyObserver(new Weather(random.nextDouble(-10,50)));
    }

}
