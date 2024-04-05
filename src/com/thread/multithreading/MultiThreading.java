package com.thread.multithreading;

public class MultiThreading {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            MultiThreadingExample m1 = new MultiThreadingExample(i);
            m1.start();
        }
    }
}
