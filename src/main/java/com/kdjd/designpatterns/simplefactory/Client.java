package com.kdjd.designpatterns.simplefactory;

public class Client {

    public static void main(String[] args) {

        Factory.create("A");

        Factory.create("B");
    }
}
