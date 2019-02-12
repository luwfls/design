package com.luwfls.design.factorymethod;

public class AudiCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
