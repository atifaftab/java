package com.dsa.linkedList.findMiddleNode;

public class Main {
    public static void main(String[] args) {
        FindMiddleNodeLinkedList findMiddleNodeLinkedList = new FindMiddleNodeLinkedList(1);
        findMiddleNodeLinkedList.append(2);
        findMiddleNodeLinkedList.append(3);
        findMiddleNodeLinkedList.append(4);
        findMiddleNodeLinkedList.append(5);
        findMiddleNodeLinkedList.append(6);

        findMiddleNodeLinkedList.printList();

        System.out.println("Value of middle Node " + findMiddleNodeLinkedList.findMiddleNode().value);
    }
}
