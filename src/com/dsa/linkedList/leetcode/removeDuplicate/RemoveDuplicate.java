package com.dsa.linkedList.leetcode.removeDuplicate;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public RemoveDuplicate(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    public void removeDuplicates() {
        Set<Integer> setInt = new HashSet<>();
        Node temp = head;
        Node pre = head;
        while (temp != null) {
            if (setInt.contains(temp.value)) {
                pre.next = temp.next;
                length--;
            } else {
                setInt.add(temp.value);
                pre = temp;
            }
            temp = temp.next;
        }
    }
      /*
        1
        1
        2
        2
        3
        3
        3
        4
        */

}