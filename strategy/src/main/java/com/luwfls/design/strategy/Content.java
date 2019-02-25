package com.luwfls.design.strategy;

/**
 * 上下文类
 * 负责跟具体的策略类交互，使得算法可以独立于客户端独立变化
 */
public class Content {
    private Strategy strategy;

    public Content(Strategy strategy) {
        this.strategy = strategy;
    }

    public void pringPrice(Double s){
        System.out.println(String.format("你该报价：%f",strategy.getPrice(s)));
    }

}
