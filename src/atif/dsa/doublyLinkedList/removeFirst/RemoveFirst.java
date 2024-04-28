package atif.dsa.doublyLinkedList.removeFirst;

import atif.dsa.doublyLinkedList.removeLast.RemoveLast;

public class RemoveFirst {
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

    public RemoveFirst(int value) {
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

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        }else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        Node newHead = head.next;
        head.next = null;
        newHead.prev = null;
        head = newHead;
        if (length == 0) {
            head = null;
            tail = null;
        }
        length--;
        return temp;
    }
}
