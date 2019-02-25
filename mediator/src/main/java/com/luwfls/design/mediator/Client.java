package com.luwfls.design.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator m = new President();
        Development development = new Development(m);
        Finacial finacial = new Finacial(m);
        Marcket marcket = new Marcket(m);

        marcket.selfAction();
        marcket.outAction();
    }
}
