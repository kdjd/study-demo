package com.kdjd.designpatterns.prototype;

public class ConcretePrototypeB extends Prototype {
    public static int FLAG = 2;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void print() {
        System.out.println(getName());
    }

    @Override
    public void setName(String name) {
        name += "B";
        super.setName(name);
    }
}
