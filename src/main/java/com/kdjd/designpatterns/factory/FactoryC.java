package com.kdjd.designpatterns.factory;

public class FactoryC implements Factory {
    @Override
    public Product create() {
        return new ProductC();
    }
}
