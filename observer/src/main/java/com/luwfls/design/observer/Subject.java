package com.luwfls.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    protected List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void removeRegister(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(o -> o.update(this));
    }
}

class ConcreteSubject extends Subject{
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
