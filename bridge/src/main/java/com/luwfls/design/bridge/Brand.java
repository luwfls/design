package com.luwfls.design.bridge;

/**
 * 品牌维度
 */
public interface Brand {
    void sale();
}
class Dell implements Brand {
    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}
class Lenovo implements Brand{
    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}