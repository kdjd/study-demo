package com.kdjd.designpatterns.singleton;

public class Client {

    public static void main(String[] args) {
        Singleton01 singleton01 = Singleton01.getUniqueInstance();
        singleton01.print();

        Singleton02 singleton02 = Singleton02.getUniqueInstance();
        singleton02.print();

        Singleton03 singleton03 = Singleton03.getUniqueInstance();
        singleton03.print();

        Singleton04 singleton04 = Singleton04.getUniqueInstance();
        singleton04.print();

        Singleton05 singleton05 = Singleton05.getUniqueInstance();
        singleton05.print();

        Singleton06.INSTANCE.print();


    }
}
