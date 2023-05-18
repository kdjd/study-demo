package com.kdjd.designpatterns.factory;

public class Client {

    public static void main(String[] args) {
        Factory factory;
        factory = new FactoryA();
        factory.create();
        factory = new FactoryB();
        factory.create();
        factory = new FactoryC();
        factory.create();
    }
}
