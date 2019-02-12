package com.luwfls.design.adapter;

public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter(new Adaptee());
        Target adapter2 = new Adapter2();
        adapter.request();
        adapter2.request();
    }
}
