package com.collection.linkedList.internal2;

import com.collection.linkedList.Internal.LinkedListInternal;

public class Main {
    public static void main(String[] args) {

        LinkedListImplementation list = new LinkedListImplementation();

        list.insert(12);
        list.insert(345);
        list.insert(67);
        list.insert(1);

        // list.show();

        list.insertStart(0);
        list.insertAtIndex(0, 100);
        list.show();
    }
}
