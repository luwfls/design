package com.luwfls.design.abstractfactory;

public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{


    @Override
    public void revolve() {
        System.out.println("磨损低");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("磨损高");
    }
}
