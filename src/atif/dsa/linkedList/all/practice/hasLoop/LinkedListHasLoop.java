package atif.dsa.linkedList.all.practice.hasLoop;

public class LinkedListHasLoop {
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

    public LinkedListHasLoop(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void allPrint() {
        if (head == null) {
            System.out.println("head: null");
            System.out.println("tail: null");
        } else {
            System.out.println("head: " + head.value);
            System.out.println("tail: " + tail.value);
        }
        System.out.println("\nLinkedList");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void createLoop() {
        tail.next = head;
    }

    public boolean hasLoop() {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
