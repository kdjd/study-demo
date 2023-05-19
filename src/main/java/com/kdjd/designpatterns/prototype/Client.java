package com.kdjd.designpatterns.prototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototypeA = new ConcretePrototypeA();
        ConcretePrototypeA cpA = (ConcretePrototypeA) prototypeA.clone();
        cpA.setName("first = ");
        cpA.print();

        Prototype prototypeB = new ConcretePrototypeB();
        ConcretePrototypeB cpB = (ConcretePrototypeB) prototypeB.clone();
        cpB.setName("second = ");
        cpB.print();
    }
}
