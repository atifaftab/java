package com.dsa.linkedList.hasLoop;

public class HasLoopMain {
    public static void main(String[] args) {
        HasLoopLinkedList linkedList = new HasLoopLinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        // create a loop by connecting the tail to the second node
        linkedList.getTail().next = linkedList.getHead().next;
        System.out.println(linkedList.hasLoop());
    }
}
