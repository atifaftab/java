package atif.dsa.queue;

public class QueueDemoMain {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo(5);
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        queue.printQueue();
    }
}
