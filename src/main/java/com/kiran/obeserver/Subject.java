package com.kiran.obeserver;

public interface Subject {

    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers(Message message);
}
