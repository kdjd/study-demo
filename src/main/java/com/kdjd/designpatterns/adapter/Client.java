package com.kdjd.designpatterns.adapter;

public class Client {

    public static void main(String[] args) {
        Task task = new Task(10);

        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();
    }
}
