package com.luwfls.design.template;

public abstract class BankTemplateMethod {
    public void takeNumber(){
        System.out.println("取号排队");
    }
    //具体业务
    public abstract void transact();

    public void evaluate(){
        System.out.println("反馈评分");
    }

    public final void process(){
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
}

class DrawMoney extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("办理取款业务");
    }
}