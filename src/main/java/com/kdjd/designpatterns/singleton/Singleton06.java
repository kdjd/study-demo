package com.kdjd.designpatterns.singleton;

import java.util.Date;

/**
 * 枚举实现
 */
public enum Singleton06 {
    /**
     * 唯一枚举
     */
    INSTANCE;

    void print() {
        System.out.println(new Date());
    }
}
