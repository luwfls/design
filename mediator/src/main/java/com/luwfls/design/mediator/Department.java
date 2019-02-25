package com.luwfls.design.mediator;

public interface Department {
    void selfAction();//内部动作
    void outAction();//通过中介者执行的外部动作
}
//研发部
class Development implements Department {
    //中介者
    private Mediator m;

    public Development(Mediator m) {
        this.m = m;
        m.register("development",this);
    }

    @Override
    public void selfAction() {
        System.out.println("专心科研，压法项目");
    }

    @Override
    public void outAction() {
        System.out.println("工作汇报，没钱了，需要资金支持");
        m.command("finacial");
    }
}
//财务部

class Finacial implements Department{

    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial",this);
    }

    @Override
    public void selfAction() {
        System.out.println("审核，拨款");
    }

    @Override
    public void outAction() {
        System.out.println("工作汇报，钱太多了，怎么花？");
    }
}

//市场部

class Marcket implements Department{

    private Mediator mediator;

    public Marcket(Mediator mediator) {
        this.mediator = mediator;
        mediator.register("marcket",this);
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目");
    }

    @Override
    public void outAction() {
        System.out.println("项目汇报，项目承接的进度，需要资金支持");
        mediator.command("finacial");
    }
}