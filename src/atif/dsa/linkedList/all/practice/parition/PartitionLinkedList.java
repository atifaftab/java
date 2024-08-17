package atif.dsa.linkedList.all.practice.parition;

public class PartitionLinkedList {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public PartitionLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        length = 1;
    }

    public void allPrint() {
        if (head == null) {
            System.out.println("head: null");
            System.out.println("tail: null");
        } else {
            System.out.println("head: " + head.value);
        }
        System.out.println("\nLinkedList");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
            System.out.println("length: " + length);
        }
    }

    public void printList() {
        PartitionLinkedList.Node temp = head;
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
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        length++;
    }

    public void partitionList(int x) {
        if (head == null) return;
        Node lesser = new Node(0);
        Node higher = new Node(0);
        Node prev1 = lesser;
        Node prev2 = higher;
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                prev1.next = current;
                prev1 = current;
            } else {
                prev2.next = current;
                prev2 = current;
            }
            current = current.next;
        }
        prev2.next = null;
        prev1.next = higher.next;
        head = lesser.next;
    }

}
