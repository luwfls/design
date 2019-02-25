package com.luwfls.design.command;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReciever();
        Command command = new ConcreteCommand(receiver);
        Invoke invoke = new Invoke(command);

        invoke.call();
    }
}
