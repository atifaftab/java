package com.dsa.linkedList.set;

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist(0);
        linkedlist.append(1);
        linkedlist.append(2);
        linkedlist.append(3);

        linkedlist.set(9, 3);

        linkedlist.printLinkedList();
    }


}
