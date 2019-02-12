package com.luwfls.design.builder;

public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public MyAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip createAirShip() {
        AirShip airShip = new AirShip();
        airShip.setEngine(airShipBuilder.buildEngine());
        airShip.setOrbitalModule(airShipBuilder.buildOrbitalModule());
        airShip.setEscapeTower(airShipBuilder.buildEscapeTower());
        return airShip;
    }
}
