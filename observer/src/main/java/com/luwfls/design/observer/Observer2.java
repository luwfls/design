package com.luwfls.design.observer;

import java.util.Observable;
import java.util.Observer;

public class Observer2 implements Observer {

    private int state;

    @Override
    public void update(Observable o, Object arg) {
            this.state = ((Subject2)o).getState();
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
