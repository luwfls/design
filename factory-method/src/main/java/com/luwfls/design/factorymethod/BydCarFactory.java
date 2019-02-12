package com.luwfls.design.factorymethod;

public class BydCarFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new Byd();
    }
}
