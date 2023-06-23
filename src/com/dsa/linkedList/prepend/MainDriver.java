package com.dsa.linkedList.prepend;

public class MainDriver {

    public static void main(String[] args) {

        PrepEndLinkedList myLinkedList = new PrepEndLinkedList(1);
        myLinkedList.append(2);
        myLinkedList.removeNodeLast();

        System.out.println("\nLinked List:");
        myLinkedList.displayLinkedList();

        myLinkedList.prepEnd(3);
        System.out.println("\nLinked List after append :");
        myLinkedList.displayLinkedList();
    }
}
