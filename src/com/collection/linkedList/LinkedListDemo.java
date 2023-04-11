/*demo for linkedlist with multiple data type*/
package com.collection.linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(1);
        list.add("string");
        list.add('A');
        list.add(1.23);
        list.add(true);

        list.forEach(i -> System.out.println(i));
    }
}
