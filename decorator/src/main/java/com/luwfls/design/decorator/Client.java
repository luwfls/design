package com.luwfls.design.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        FlyCar superCar = new FlyCar(new WaterCar(new AICar(car)));
        superCar.move();

    }
}
