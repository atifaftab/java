package com.dsa.linkedListPractice;

public class LinkedListExample {

    private Node tail;
    private Node head;
    private int length;

    static class Node {
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
}
