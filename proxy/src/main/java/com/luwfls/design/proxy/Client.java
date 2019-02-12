package com.luwfls.design.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        //静态代理
        Star star = new ProxyStar(new RealStar());
        star.bookTicket();
        star.sing();
        star.confer();
        star.signContract();
        //动态代理

        Star star2 = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, new StarHandler(new RealStar()));
        star2.sing();
    }
}
