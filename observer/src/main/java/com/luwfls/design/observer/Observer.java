package com.luwfls.design.observer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public interface Observer {
    void update(Subject subject);
}

class ObserverA implements Observer{
    private int mystate;

    @Override
    public void update(Subject subject) {
        this.mystate = ((ConcreteSubject)subject).getState();
    }

    public int getMystate() {
        return mystate;
    }

    public void setMystate(int mystate) {
        this.mystate = mystate;
    }
}