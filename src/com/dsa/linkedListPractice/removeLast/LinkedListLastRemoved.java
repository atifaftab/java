package com.dsa.linkedListPractice.removeLast;

public class LinkedListLastRemoved {
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

    LinkedListLastRemoved(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printHead() {
        System.out.println("head = " + head.value);
    }

    public void printTail() {
        System.out.println("tail = " + tail.value);
    }

    public void getLength() {
        System.out.println("length = " + length);
    }

    public Node appEnd(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
        return node;
    }
}
