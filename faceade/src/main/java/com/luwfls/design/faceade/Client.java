package com.luwfls.design.faceade;

public class Client {
    public static void main(String[] args) {
        RegisterFacade registerFacade = new RegisterFacade();
        registerFacade.register();
    }
}
