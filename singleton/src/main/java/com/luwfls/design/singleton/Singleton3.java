package com.luwfls.design.singleton;

/**
 * 双重检查锁
 */
public class Singleton3 {
    public static Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    synchronized (Singleton3.class) {
                        instance = new Singleton3();
                    }
                }
                return instance;
            }
        } else {
            return instance;
        }
    }
}
