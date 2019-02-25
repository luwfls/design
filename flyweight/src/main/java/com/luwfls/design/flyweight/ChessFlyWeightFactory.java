package com.luwfls.design.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ChessFlyWeightFactory {

    private static Map<String, ChessFlyWeight> map = new ConcurrentHashMap<>();
    public static ChessFlyWeight getChess(String color){
        return map.computeIfAbsent(color, s -> new ConcreteChess(color));
    }
}
