package com.luwfls.design.mediator;

import java.util.HashMap;
import java.util.Map;

//中介者接口
public interface Mediator {
    void register(String dname,Department d);
    void command(String dname);
}

// 总经理
class  President implements Mediator{

    private Map<String, Department> map = new HashMap<>();

    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }
}
