package com.kdjd.designpatterns.simplefactory;


public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.from simple factory");
    }
}
