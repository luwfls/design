package com.luwfls.design.iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
 /*       ConcreteMyAggreate cma = new ConcreteMyAggreate();
        cma.addObject("a");
        cma.addObject("b");
        cma.addObject("c");

        MyIterator itr = cma.createIterator();

        while (itr.hasNext()){
            System.out.println(itr.getCurrentObj());
            itr.next();
        }*/

       final ConcreteMyAggreate cma = new ConcreteMyAggreate();

        TestInnerClass testInnerClass = new TestInnerClass() {
            @Override
            public void test() {
                cma.addObject(1);
                System.out.println(cma);
            }
        };

        testInnerClass.test();
        System.out.println(cma);
    }
}
