package atif.thread.multithreading;

public class LambdaMultiThreading {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1 " + Thread.currentThread().getId());
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t2 " + Thread.currentThread().getId());
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("t3 " + Thread.currentThread().getId());
            }
        });
        try {
            t1.start();
            t1.join();
            t2.start();
            t3.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
