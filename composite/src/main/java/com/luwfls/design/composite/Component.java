package com.luwfls.design.composite;

public interface Component {
    void opreation();
}

interface Leaf extends Component {

}

interface Composite extends Component {
    void add(Component component);

    void remove(Component component);

    void getChild(int index);
}