package com.luwfls.design.momento;

/**
 * 源发器类
 */
public class Emp {
    private String ename;
    private int age;
    private double salary;

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void recovery(EmpMemento empMemento){
        this.ename = empMemento.getEname();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
    }

    public EmpMemento memento(){
        return new EmpMemento(this);
    }
}
