package atif.dsa.linkedList.RemoveLast;

public class RemoveLastLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    RemoveLastLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void displayLinkedList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head : " + head.value);
    }

    public void getTail() {
        System.out.println("Tail : " + tail.value);
    }

    public void getLength() {
        System.out.println("Length : " + length);
    }


    public void appEnd(int value){
        Node node = new Node(value);
//        Node temp = head;

        if(length == 0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        length++;
    }

    public Node removeLast() {

        Node temp = head;
        if (length == 0) return null;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;


    }
}
