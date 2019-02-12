package com.luwfls.design.builder;

public class Client {
    public static void main(String[] args) {
        MyAirShipDirector myAirShipDirector = new MyAirShipDirector(new MyAirShipBuilder());
        System.out.println(myAirShipDirector.createAirShip());
    }
}
