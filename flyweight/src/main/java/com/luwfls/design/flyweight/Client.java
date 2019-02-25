package com.luwfls.design.flyweight;

public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        chess.display(new Coordinate(1,2));
        chess2.display(new Coordinate(2,2));
    }
}
