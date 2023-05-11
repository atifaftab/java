package com.dsa.linkedList.RemoveLast;

import com.dsa.linkedList.RemoveLastLinkedList;

public class Main {

    public static void main(String[] args) {

        RemoveLastLinkedList myLinkedList = new RemoveLastLinkedList(1);
        myLinkedList.append(2);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4

        */

    }
}
