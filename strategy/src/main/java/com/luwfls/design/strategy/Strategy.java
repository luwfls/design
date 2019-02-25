package com.luwfls.design.strategy;

public interface Strategy {
    Double getPrice(Double price);
}

class NewCustomerFewStrategy implements Strategy {

    @Override
    public Double getPrice(Double price) {
        System.out.println("新用户少量，原价");
        return price;
    }
}

class NewCustomerManyStrategy implements Strategy {

    @Override
    public Double getPrice(Double price) {
        System.out.println("新用户大量，打九折");
        return price * 0.9;
    }
}

class OldCustomerFewStrategy implements Strategy {

    @Override
    public Double getPrice(Double price) {
        System.out.println("老用户少量，打八五折");
        return price * 0.85;
    }
}

class OldCustomerManyStrategy implements Strategy {

    @Override
    public Double getPrice(Double price) {
        System.out.println("老用户少量，打八折");
        return price * 0.8;
    }
}


