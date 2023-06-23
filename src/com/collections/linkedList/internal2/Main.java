package com.collections.linkedList.internal2;

public class Main {
    public static void main(String[] args) {

        LinkedListImplementation list = new LinkedListImplementation();

        list.insert(12);
        list.insert(345);
        list.insert(67);
        list.insert(1);
        list.insertStart(0);
        list.insertAtIndex(0, 100);
        System.out.println("before deleting");
        list.show();
        list.deleteAtIndex(3);
        System.out.println("after deleting");
        list.show();
    }
}
