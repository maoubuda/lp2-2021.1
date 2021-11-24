package br.ifce.core.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    public List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public void cancel(Observer observer) {
        this.observers.remove(observer);
    }

    public abstract void notifyObservers();

}
