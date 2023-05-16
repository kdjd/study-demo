package com.kdjd.designpatterns.simplefactory;


public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.from simple factory");
    }
}
