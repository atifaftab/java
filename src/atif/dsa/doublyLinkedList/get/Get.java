package atif.dsa.doublyLinkedList.get;

public class Get {
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

    public Get(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

}
