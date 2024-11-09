package atif.dsa.queue;

public class QueueDemo {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public QueueDemo(int value) {
        Node node = new Node(value);
        this.first = node;
        this.last = node;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        System.out.println("QUEUE:");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printFirst() {
        System.out.println("first: " + first.value);
    }

    public void printLast() {
        System.out.println("Last: " + last.value);
    }

    public void printLength() {
        System.out.println("Length: " + length);
    }
}
