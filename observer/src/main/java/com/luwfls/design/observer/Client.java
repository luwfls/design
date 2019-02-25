package com.luwfls.design.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observer1 = new ObserverA();
        Observer observer2 = new ObserverA();
        Observer observer3 = new ObserverA();

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        ((ConcreteSubject) subject).setState(2);

        System.out.println(((ObserverA) observer1).getMystate());
        System.out.println(((ObserverA) observer2).getMystate());
        System.out.println(((ObserverA) observer3).getMystate());
    }
}
