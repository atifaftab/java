package atif.dsa.doublyLinkedList.insert;

public class Insert {
    private Node head;
    private Node tail;
    private Node prev;
    private int length;

    class Node {
        int value;
        Node next;

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

    public boolean insert(int index, int value) {
        return false;
    }
}
