package atif.thread.executer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample implements Runnable {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
//            Thread t1 = new Thread(new ExecutorExample());
//            t1.start();
            service.execute(new ExecutorExample());
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
