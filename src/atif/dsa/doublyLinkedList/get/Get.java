package atif.dsa.doublyLinkedList.get;

import atif.dsa.doublyLinkedList.append.Append;

public class Get {
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

    public Get(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }
    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        length++;
    }
    public Node get(int index){
        if(index<0 || index >=length) return null;
        Node temp = head;
        if(index<length/2){
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
        }else {
            temp =tail;
            for(int i=length-1;i>index;i--){
                temp = temp.prev;
            }
        }
        return temp;
    }
}
