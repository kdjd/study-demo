package com.kdjd.designpatterns.simplefactory;

public class Factory {

    public static Product create(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                return null;
        }
    }
}
