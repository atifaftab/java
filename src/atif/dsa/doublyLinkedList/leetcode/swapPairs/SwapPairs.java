package atif.dsa.doublyLinkedList.leetcode.swapPairs;

import atif.dsa.doublyLinkedList.leetcode.palindrome.PalindromeDoublyLinkedList;

public class SwapPairs {

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

    SwapPairs(int value) {
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

    void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        length++;
    }

    void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        length++;
    }

    Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    Node get(int index) {
        if (index < 0 || index > length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void swapPairs() {
        if (length <= 1) return;
        Node current = head;
        while (current.next != null) {
            int temp = current.value;
            current.value = current.next.value;
            current.next.value = temp;
            current = current.next.next;
        }
    }
}
