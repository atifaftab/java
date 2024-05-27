package atif.thread.executer;

public class ExecutorExample implements Runnable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new ExecutorExample());
            t1.start();
        }
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }

    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
    }
}
