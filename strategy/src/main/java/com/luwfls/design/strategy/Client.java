package com.luwfls.design.strategy;

public class Client {

    public static void main(String[] args) {
        Content content = new Content(new OldCustomerFewStrategy());
        content.pringPrice(998d);
    }
}
