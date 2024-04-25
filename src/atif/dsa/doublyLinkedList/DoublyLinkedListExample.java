package atif.dsa.doublyLinkedList;

public class DoublyLinkedListExample {
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

    public DoublyLinkedListExample(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printDoubleLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("head: " + head.value);
    }

    public void getTail() {
        System.out.println("tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("length: " + length);
    }
}
