package com.kdjd.designpatterns.prototype;

public class ConcretePrototypeA extends Prototype {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print() {
        System.out.println(getName());
    }

    @Override
    public void setName(String name) {
        name += "A";
        super.setName(name);
    }
}
