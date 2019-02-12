package com.luwfls.design.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new LuxuryCarFactory();
        Engine engine = carFactory.createEngine();
        Seat seat = carFactory.createSeat();
        Tyre tyre = carFactory.createTyre();
        engine.run();
        engine.start();
        seat.message();
        tyre.revolve();
    }
}
