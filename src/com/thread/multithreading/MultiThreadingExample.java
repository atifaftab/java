package com.thread.multithreading;

public class MultiThreadingExample extends Thread {

    private int number;

    public MultiThreadingExample(int num) {
        number = num;
    }

    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            System.out.println(i + " from thread " + number);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
