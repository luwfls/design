package com.luwfls.design.command;

/**
 * 调用者，发起者
 */
public class Invoke {
    //一条或多条命令
    private Command command;

    public Invoke(Command command) {
        this.command = command;
    }

    public void call(){
        command.execute();
    }
}
