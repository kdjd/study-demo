package com.kdjd.designpatterns.bridge;

public class BigCar extends RefinedCar {
    public BigCar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "Big";
    }
}
