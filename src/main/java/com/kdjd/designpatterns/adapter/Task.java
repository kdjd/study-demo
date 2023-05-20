package com.kdjd.designpatterns.adapter;

import java.util.concurrent.Callable;

public class Task implements Callable<Long> {

    private long size;

    public Task(long size) {
        this.size = size;
    }

    @Override
    public Long call() throws Exception {
        long count = 0;
        for (long i = 0; i < size; i++) {
            count += i;
        }
        System.out.println(count);
        return count;
    }
}
