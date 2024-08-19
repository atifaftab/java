package atif.dsa.linkedList.all.newList;

import java.util.LinkedList;

public class NewListFromAnother {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    public NewListFromAnother(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printAll() {
        if (head == null || length == 0) {
            System.out.println("Empty LinkedList");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("tail: " + tail.value);
            System.out.println("Length: " + length);
            printList();
        }

    }

    private void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public void newLinkedList() {
        if (head == null || length == 0) return;
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Node temp = head;
        while (temp != null) {
            integerLinkedList.add(temp.value);
            temp = temp.next;
        }
        System.out.println(integerLinkedList);
    }

    public void newHigherAndLowerLinkedList(int x) {
        if (head == null || length == 0) return;
        LinkedList<Integer> higherLinkedList = new LinkedList<>();
        LinkedList<Integer> lowerLinkedList = new LinkedList<>();
        Node temp = head;
        while (temp != null) {
            if (temp.value >= x) {
                higherLinkedList.add(temp.value);
            } else {
                lowerLinkedList.add(temp.value);
            }
            temp = temp.next;
        }
        System.out.println("Linkedlist with value higher or equal than " + x + " \n " + higherLinkedList);
        System.out.println("Linkedlist with value lower than " + x + " \n " + lowerLinkedList);

    }
}
