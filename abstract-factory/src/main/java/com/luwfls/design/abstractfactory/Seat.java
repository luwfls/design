package com.luwfls.design.abstractfactory;

public interface Seat {
    void message();
}
class LuxurySeat implements Seat{

    @Override
    public void message() {
        System.out.println("真皮座椅");
    }
}

class LowSeat implements Seat{

    @Override
    public void message() {
        System.out.println("布艺座椅");
    }
}