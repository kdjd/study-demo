package com.kdjd.designpatterns.bridge;

public class Client {

    public static void main(String[] args) {

        RefinedCar car = new BossCar(new HybridEngine());
        car.drive();

        car = new BigCar(new FuelEngine());
        car.drive();

        car = new ThinCar(new ElectricEngine());
        car.drive();

    }
}
