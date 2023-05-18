package com.kdjd.designpatterns.singleton;

import java.util.Date;

/**
 * 双重校验锁-线程安全
 */
public class Singleton04 {
    private volatile static Singleton04 uniqueInstance;

    private Singleton04() {
    }

    public static synchronized Singleton04 getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton04.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton04();
                }
            }
        }
        return uniqueInstance;
    }

    void print() {
        System.out.println(new Date());
    }
}
