package com.dsa.linkedListPractice.append;

public class LinkedListExample {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedListExample(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
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

    public void appEnd(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }
}
