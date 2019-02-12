package com.luwfls.design.factorymethod;

/**
 * 简单工厂模式
 * OCP 开闭原则
 * DIP 依赖倒置原则 面向接口编程
 * Lod 迪米特法则 只与你的朋友通信，避免跟陌生人通信
 */
public interface CarFactory {
    Car getCar();
}
