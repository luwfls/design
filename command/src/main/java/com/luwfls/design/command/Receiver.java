package com.luwfls.design.command;

/**
 * 命令接收者执行者
 */
public interface Receiver {
    void action();
}

class ConcreteReciever implements  Receiver{

    @Override
    public void action() {

    }
}
