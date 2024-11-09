package atif.dsa.queue;

public class QueueDemoMain {
    public static void main(String[] args) {
        QueueDemo queue = new QueueDemo(5);
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        queue.printQueue();
        System.out.println("---- ENQUEUE ----");
        queue.enqueue(7);
        queue.enqueue(28);
        queue.enqueue(21);
        queue.enqueue(4);
        queue.enqueue(18);
        queue.printQueue();
        queue.printFirst();
        queue.printLast();
        queue.printLength();
        System.out.println("---- Dequeue ----");
        System.out.println(queue.dequeue().value);
        queue.printQueue();
        queue.printFirst();
        queue.printLast();
        queue.printLength();
    }
}
