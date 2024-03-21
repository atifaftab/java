package com.dsa.linkedList.removeFirst;

public class RemoveFirstMain {
    public static void main(String[] args) {
        RemoveFirstLinkedList removeFirstLinkedList = new RemoveFirstLinkedList(3);
        removeFirstLinkedList.prepEnd(2);
        removeFirstLinkedList.prepEnd(1);
        removeFirstLinkedList.appEnd(4);
        removeFirstLinkedList.appEnd(5);
        removeFirstLinkedList.printLinkedList();
        removeFirstLinkedList.getLength();

        System.out.println("------after removing last element ------");

        System.out.println("removed element : " + removeFirstLinkedList.removeLast().value);
        System.out.println("removed element : " + removeFirstLinkedList.removeLast().value);
        removeFirstLinkedList.getLength();

        System.out.println("------ rest of the element ------");
        removeFirstLinkedList.printLinkedList();
        removeFirstLinkedList.getLength();
        System.out.println("---removing first -------");
        System.out.println("removed element : " + removeFirstLinkedList.removeFirst().value);
        removeFirstLinkedList.printLinkedList();
        removeFirstLinkedList.getLength();
    }
}
