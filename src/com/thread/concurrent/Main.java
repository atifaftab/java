package com.thread.concurrent;

import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser();
        phaser.register();

        ConcurrentMultiThreading obj1 = new ConcurrentMultiThreading("Atif",phaser);
        ConcurrentMultiThreading obj2= new ConcurrentMultiThreading("Atif",phaser);

        new Thread(obj1).start();
        new Thread(obj2).start();

        Thread.sleep(10);


        System.out.println("-----------------------------------------------");
        System.out.println(" Now open the phaser barrier:");
        System.out.println("-----------------------------------------------");
        phaser.arriveAndAwaitAdvance();
    }
}
