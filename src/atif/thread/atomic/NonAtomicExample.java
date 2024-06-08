package atif.thread.atomic;

public class NonAtomicExample {
    private int counter = 0;
    public void increment() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
    public static void main(String[] args) {
        NonAtomicExample nonAtomicExample = new NonAtomicExample();
        Runnable task = () -> {
            for (int i = 0; i < 100000; i++) {
                nonAtomicExample.increment();
            }
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nonAtomicExample.getCounter());
    }

}
