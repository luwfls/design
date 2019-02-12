package com.luwfls.design.simplefactory;

public class Client {
    public static void main(String[] args) {
        CarFactory.getCar("byd").run();
    }
}
