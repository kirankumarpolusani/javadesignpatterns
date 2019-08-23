package com.kiran.obeserver;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observers = null;

    public SubjectImpl(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Message message) {
        for(Observer observer : observers) {
            observer.update(message);
        }
    }
}
