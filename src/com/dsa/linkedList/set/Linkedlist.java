package com.dsa.linkedList.set;

public class Linkedlist {
    Node head;
    Node tail;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Linkedlist(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    Node getHead() {
        if (length == 0) return null;
        return head;
    }

    Node getTail() {
        if (length == 0) return null;
        return tail;
    }

    void append(int value) {
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

    Node set(int value, int index) {
        if (index < 0 || index > length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
//            temp.value = value;
        }
        temp.value = value;
        return temp;
    }

    Node removeLast(){
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp =temp.next;
        }
        tail = pre;
        pre.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

}
