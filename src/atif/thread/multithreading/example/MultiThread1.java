package atif.thread.multithreading.example;

public class MultiThread1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 0; i <= num; i++) {
            Thread obj = new Thread(new MultiThread1());
            obj.start();
        }
    }
}
