package com.luwfls.design.singleton;

/**
 * 静态内部类
 */
public class Singleton4 {

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
       return Singleton4Holder.instance;
    }

    private static class Singleton4Holder{
        public static final Singleton4 instance = new Singleton4();
    }
}
