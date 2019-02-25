package com.luwfls.design.observer;


import java.util.Observable;
//使用jdk 原生的观察者模式工具类
public class Subject2 extends Observable {

    private int state;

    public void setState(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }
}
