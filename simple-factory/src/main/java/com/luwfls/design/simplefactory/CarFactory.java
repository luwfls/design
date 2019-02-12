package com.luwfls.design.simplefactory;

/**
 * 简单工厂模式
 * OCP 开闭原则
 * DIP 依赖倒置原则 面向接口编程
 * Lod 迪米特法则 只与你的朋友通信，避免跟陌生人通信
 */
public class CarFactory {
    public static Car getCar(String type) {
        switch (type) {
            case "audi":
                return new Audi();
            case "byd":
                return new Byd();
            default:
                return null;
        }
    }
}
