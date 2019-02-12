package com.luwfls.design.factorymethod;

public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new AudiCarFactory();
        carFactory.getCar().run();
    }
}
