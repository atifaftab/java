package atif.dsa.linkedList;

public class ReverseLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    ReverseLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getLength() {
        System.out.println("length : " + length);
    }

    public void prepEnd(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public void appEnd(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public void reverse(){
        if(length <2) return;
        Node temp = head;
        head = tail;
        tail = temp;
        Node post= null;
        Node pre= null;
        for(int i=0; i<length; i++){
            post= temp.next;
            temp.next = pre;
            pre = temp;
            temp = post;
        }
    }

}
