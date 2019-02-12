package com.luwfls.design.builder;

public class AirShip {
    private OrbitalModule orbitalModule;
    private Engine engine;
    private EscapeTower escapeTower;

    @Override
    public String toString() {
        return "AirShip{" +
                "orbitalModule=" + orbitalModule +
                ", engine=" + engine +
                ", escapeTower=" + escapeTower +
                '}';
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }
}

class OrbitalModule{
    private String name;

    @Override
    public String toString() {
        return "OrbitalModule{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrbitalModule(String name) {
        this.name = name;
    }
}
class Engine{
    private String name;

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine(String name) {
        this.name = name;
    }
}
class EscapeTower{
    private String name;

    @Override
    public String toString() {
        return "EscapeTower{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {
        this.name = name;
    }
}
