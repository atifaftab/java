package atif.thread;

public class MultiThreadExample {

    public static void main(String[] args) {
        System.out.println("Start");
        Printer p = new Printer();
        MyThread t1 = new MyThread(p);
        YourThread t2 = new YourThread(p);
        t2.start();
        new Thread(t1).start();

        System.out.println("Finish");
    }
}

class MyThread implements Runnable {
    Printer pRef;

    MyThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        synchronized (pRef) {
            pRef.print(10, "Atif");
        }
    }
}


class YourThread extends Thread {
    Printer pRef;

    YourThread(Printer p) {
        pRef = p;
    }

    public void run() {
        pRef.print(9, "Macbook");
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}


class Printer {
    //    synchronized public void print(int num, String name) {
    public void print(int num, String name) {
        for (int i = 0; i < num; i++) {
            System.out.println("Printing " + i + " for " + name);
        }
    }
}
