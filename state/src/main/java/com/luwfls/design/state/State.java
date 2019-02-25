package com.luwfls.design.state;

public interface State {
    void handle();
}

class FreeState implements State{

    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住");
    }
}

class BookState implements State{

    @Override
    public void handle() {
        System.out.println("房间已预定，别人不能定");
    }
}

class CheckedInState implements State{

    @Override
    public void handle() {
        System.out.println("房间已入住，请勿打扰");
    }
}