package com.kdjd.designpatterns.singleton;

import java.util.Date;

/**
 * 懒汉式-线程安全
 */
public class Singleton03 {
    private static Singleton03 uniqueInstance;

    private Singleton03() {
    }

    public static synchronized Singleton03 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton03();
        }
        return uniqueInstance;
    }

    void print() {
        System.out.println(new Date());
    }
}
