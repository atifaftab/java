package com.dsa.linkedList.get;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        int data;
        Node next;
        Node(int value){
            this.data = value;
        }
    }

    LinkedList(int value){
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        length = 1;

    }

    void displayLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void append(int value){
        Node node = new Node(value);

        if(length == 0){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

}
