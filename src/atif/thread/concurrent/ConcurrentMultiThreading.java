package atif.thread.concurrent;

import java.time.Instant;
import java.util.concurrent.Phaser;


public class ConcurrentMultiThreading implements Runnable{

    private Phaser phaser;
    public String name;

    ConcurrentMultiThreading(String name, Phaser phaser){
        this.phaser = phaser;
        phaser.register();
        this.name = name;
    }

    @Override
    public void run(){
        try {
            System.out.printf("[ %s ] created, blocked by the phaser\n", name);
            phaser.arriveAndAwaitAdvance();
            System.out.printf("[ %s ] starts at: %s\n", name, Instant.now());
        }
        catch (IllegalStateException e){
            e.printStackTrace();
        }
    }


}
