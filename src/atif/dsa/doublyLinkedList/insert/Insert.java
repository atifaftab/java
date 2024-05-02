package atif.dsa.doublyLinkedList.insert;

import atif.dsa.doublyLinkedList.set.Set;

public class Insert {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;


        public Node(int value) {
            this.value = value;
        }
    }

    public Insert(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }


    public boolean insert(int index, int value) {
        if(index==0){
            append(value);
        }
        Node temp = get(index);
        Node pre = temp(index-1);
        if(temp!=null){
            Node pre = temp.prev;
        }
        return false;
    }
}
