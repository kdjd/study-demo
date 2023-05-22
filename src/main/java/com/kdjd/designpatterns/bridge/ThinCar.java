package com.kdjd.designpatterns.bridge;

public class ThinCar extends RefinedCar {
    public ThinCar(Engine engine) {
        super(engine);
    }

    public String getBrand() {
        return "Thin";
    }
}
