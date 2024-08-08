package atif.dsa.linkedList.all.practice;

public class AllPractice {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public AllPractice(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    void getHead() {
        System.out.println("Head: " + head.value);
    }

    void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    void getLength() {
        System.out.println("Length: " + length);
    }

    boolean append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
        return true;
    }
}