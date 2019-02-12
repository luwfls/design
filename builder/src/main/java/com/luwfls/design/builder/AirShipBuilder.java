package com.luwfls.design.builder;

public interface AirShipBuilder {
    Engine buildEngine();
    OrbitalModule buildOrbitalModule();
    EscapeTower buildEscapeTower();
}
