package com.luwfls.design.state;

public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.setState(new FreeState());
        ctx.setState(new BookState());
        ctx.setState(new CheckedInState());
    }
}
