package com.dsa.linkedListPractice;

public class LinkedListExample {

    Node tail;
    Node head;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void printHead(){

    }
}
