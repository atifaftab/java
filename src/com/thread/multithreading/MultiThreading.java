package com.thread.multithreading;

public class MultiThreading {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            MultithreadThing m1 = new MultithreadThing(i);
            m1.start();
        }
    }
}
