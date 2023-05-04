package com.dsa.linkedList.append;

public class AppEndLinkedList {

    private Node head;
    private Node tail;
    private int length;


    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }

    }
    AppEndLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void displayLinkedList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    public void appEnd(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
}
