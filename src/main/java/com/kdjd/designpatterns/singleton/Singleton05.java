package com.kdjd.designpatterns.singleton;

import java.util.Date;

/**
 * 静态内部类实现
 */
public class Singleton05 {
    private Singleton05() {
    }

    public static synchronized Singleton05 getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }

    void print() {
        System.out.println(new Date());
    }

    private static class SingletonHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }
}
