package org.example.stock_observable;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data

public class Product {
    private int stockLevel;
    private List<Observer> observers =  new ArrayList<>();
    private String name;

   /* public Product(){
           this.observers = new ArrayList<>();
    }*/
    public Product( String name ,int stockInitial) {
        this.stockLevel = stockInitial;
        this.name = name;
    }

    public void setStockLevel(int newStockLevel) {
        if (newStockLevel != stockLevel) {
            stockLevel = newStockLevel;
            notifyObservers();
        }
    }
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
