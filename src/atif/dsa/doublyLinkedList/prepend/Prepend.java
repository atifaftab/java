package atif.dsa.doublyLinkedList.prepend;

public class Prepend {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    public Prepend(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        length++;
    }
}
