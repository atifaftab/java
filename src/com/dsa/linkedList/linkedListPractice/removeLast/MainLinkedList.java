package com.dsa.linkedList.linkedListPractice.removeLast;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedListLastRemoved linkedListLastRemoved = new LinkedListLastRemoved(1);
        linkedListLastRemoved.appEnd(2);
//        linkedListLastRemoved.appEnd(3);
//        linkedListLastRemoved.appEnd(4);
        linkedListLastRemoved.printLinkedList();
        System.out.println("------- after removing --------");

        //returns 2
        System.out.println(linkedListLastRemoved.removeLast().value);
        //returns 1
        System.out.println(linkedListLastRemoved.removeLast().value);
        //returns null
        System.out.println(linkedListLastRemoved.removeLast());

    }
}
