package com.luwfls.design.adapter;

/**
 * 类适配模式
 */
public class Adapter2 extends Adaptee implements Target  {

    @Override
    public void request() {
       super.specificRequest();
    }
}
