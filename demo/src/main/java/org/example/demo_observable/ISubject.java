package org.example.demo_observable;

public interface ISubject {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver(Weather weather);


}
