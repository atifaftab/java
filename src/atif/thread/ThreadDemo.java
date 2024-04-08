package atif.thread;

public class ThreadDemo {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objB.setPriority(Thread.MAX_PRIORITY);
        objA.start();
//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        objB.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
