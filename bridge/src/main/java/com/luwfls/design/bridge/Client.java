package com.luwfls.design.bridge;

public class Client {
    public static void main(String[] args) {
        Computer computer = new DeskTop(new Dell());
        Computer computer2 = new DeskTop(new Lenovo());
        computer.sale();
        computer2.sale();
    }
}
