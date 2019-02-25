package com.luwfls.design.decorator;

public interface Icar {
    void move();
}

class Car implements Icar{

    @Override
    public void move() {
        System.out.println("地上跑");
    }
}

class SuperCar implements Icar{
    protected Icar icar;

    public SuperCar(Icar icar) {
        super();
        this.icar = icar;
    }

    @Override
    public void move() {
        icar.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(Icar icar) {
        super(icar);
    }

    public void fly(){
        System.out.println("天上飞！");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(Icar icar) {
        super(icar);
    }

    public void swim(){
        System.out.println("水里游！");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AICar extends SuperCar{

    public AICar(Icar icar) {
        super(icar);
    }

    public void autoMove(){
        System.out.println("自动驾驶！");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}

