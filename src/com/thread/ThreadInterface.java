package com.thread;

public class ThreadInterface implements Runnable {

    public static void main(String[] args) {
        ThreadInterface a = new ThreadInterface();
        Thread t1 = new Thread(a);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Run Thread Run");
    }
}
