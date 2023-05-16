package com.kdjd.designpatterns.simplefactory;


public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.from simple factory");
    }
}
