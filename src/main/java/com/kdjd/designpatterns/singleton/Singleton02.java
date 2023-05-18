package com.kdjd.designpatterns.singleton;

import java.util.Date;

/**
 * 饿汉式-线程安全
 */
public class Singleton02 {
    private static final Singleton02 uniqueInstance = new Singleton02();

    private Singleton02() {
    }

    public static Singleton02 getUniqueInstance() {
        return uniqueInstance;
    }

    void print() {
        System.out.println(new Date());
    }
}
