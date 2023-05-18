package com.kdjd.designpatterns.builder;

public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("i5")
                .motherboard("b760")
                .memory("16G")
                .screen("27inc").build();
        System.out.println(computer);
    }
}
