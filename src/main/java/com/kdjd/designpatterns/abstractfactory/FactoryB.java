package com.kdjd.designpatterns.abstractfactory;

public class FactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }

    @Override
    public Gift createGift() {
        return new GiftB();
    }
}
