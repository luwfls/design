package com.luwfls.design.template;

public class Client {
    public static void main(String[] args) {

        BankTemplateMethod draw = new DrawMoney();
        draw.process();

        BankTemplateMethod method = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存款");
            }
        };
        method.process();
    }
}
