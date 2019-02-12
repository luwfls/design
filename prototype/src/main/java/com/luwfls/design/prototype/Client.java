package com.luwfls.design.prototype;

import java.util.Date;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep1 = new Sheep();
        sheep1.setBirthday(new Date());
        sheep1.setName("s1");
        Sheep sheep2 = sheep1.clone();
        sheep2.setBirthday(new Date(1000));
        sheep2.setName("s2");
        System.out.println(sheep1);
        System.out.println(sheep2);
    }
}
