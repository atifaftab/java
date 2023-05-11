package com.dsa.linkedList.RemoveLast;

import com.dsa.linkedList.RemoveLast.RemoveLastLinkedList;

public class Main {

    public static void main(String[] args) {

        RemoveLastLinkedList myLinkedList = new RemoveLastLinkedList(1);
        myLinkedList.appEnd(2);

//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.displayLinkedList();

        System.out.println("removed Node : "+myLinkedList.removeLast().value);
        System.out.println("removed Node : "+myLinkedList.removeLast().value);
        System.out.println("removed Node : "+myLinkedList.removeLast());

        System.out.println("\nLinked List after remove last Node :");
        myLinkedList.displayLinkedList();



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
