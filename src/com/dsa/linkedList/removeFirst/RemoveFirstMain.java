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
        System.out.println("removed element : " + removeFirstLinkedList.removeFirst().value);
        System.out.println("removed element : " + removeFirstLinkedList.removeFirst().value);
        System.out.println("removed element : " + removeFirstLinkedList.removeFirst());
        removeFirstLinkedList.getLength();

        System.out.println("------ adding new elements ------");
        removeFirstLinkedList.prepEnd(2);
        removeFirstLinkedList.prepEnd(1);
        removeFirstLinkedList.prepEnd(0);
        removeFirstLinkedList.appEnd(3);
        removeFirstLinkedList.printLinkedList();
        removeFirstLinkedList.getLength();

        System.out.println("index at 2 : " + removeFirstLinkedList.get(2).value);
    }
}
