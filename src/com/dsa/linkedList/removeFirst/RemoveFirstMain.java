package com.dsa.linkedList.removeFirst;

public class RemoveFirstMain {
    public static void main(String[] args) {
        RemoveFirstLinkedList removeFirstLinkedList = new RemoveFirstLinkedList(3);
        removeFirstLinkedList.prepEnd(2);
        removeFirstLinkedList.prepEnd(1);
        removeFirstLinkedList.appEnd(4);
        removeFirstLinkedList.appEnd(5);
        removeFirstLinkedList.printLinkedList();
    }
}
