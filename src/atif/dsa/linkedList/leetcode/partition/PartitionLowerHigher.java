package atif.dsa.linkedList.leetcode.partition;

public class PartitionLowerHigher {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public PartitionLowerHigher(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE PARTITIONLIST METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////
    public void partitionList(int x) {
        if (length == 0) return;
        Node lower = new Node(0);
        Node higher = new Node(0);
        Node prev1 = lower;
        Node prev2 = higher;
        Node temp = head;
        while (temp != null) {
            if (temp.value < x) {
                prev1.next = temp;
                prev1 = temp;
            } else {
                prev2.next = temp;
                prev2 = temp;
            }
            temp = temp.next;
        }
        prev2.next = null;
        prev1.next = higher.next;
        head = lower.next;
    }
}

