package com.luwfls.design.chainofresp;

public class Client {
    public static void main(String[] args) {
        GeneralManager generalManager = new GeneralManager("王五", null);
        Manager manager = new Manager("李四", generalManager);
        Director director = new Director("张三", manager);

        director.handleLeaveRequest(new LeaveRequest("大锤",200,"回家睡大觉"));
    }
}
