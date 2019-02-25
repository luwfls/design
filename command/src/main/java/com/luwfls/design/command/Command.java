package com.luwfls.design.command;

public interface Command {
    /**
     * 这是一个返回值为空的方法，
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}

class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //命令执行前后，执行相关处理
        receiver.action();
    }
}