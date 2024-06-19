package atif.dsa.doublyLinkedList.remove;

public class Remove {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Remove(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}
