package com.luwfls.design.iterator;

public interface MyIterator {
    void first();
    void next();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();
    Object getCurrentObj();
}
