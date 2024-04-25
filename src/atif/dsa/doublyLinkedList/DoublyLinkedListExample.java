package atif.dsa.doublyLinkedList;

public class DoublyLinkedListExample {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
}
