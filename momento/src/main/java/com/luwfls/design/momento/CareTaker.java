package com.luwfls.design.momento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private Map<String, EmpMemento> map = new HashMap<>();

    public void addEmpMemento(EmpMemento empMemento) {
        map.put(empMemento.getEname(), empMemento);
    }

    public EmpMemento getEmpMemento(String ename) {
        return map.get(ename);
    }
}
