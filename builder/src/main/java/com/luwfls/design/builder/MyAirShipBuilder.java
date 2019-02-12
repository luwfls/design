package com.luwfls.design.builder;

public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("我的飞船引擎");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("我的轨道舱");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("我的逃逸塔");
    }
}
