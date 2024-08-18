package atif.dsa.linkedList.all.newList;

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
        Node temp = head;
        Node newNode = new Node(0);
        Node pointer = newNode;
        while (temp != null) {
            pointer.next = temp;
            pointer = temp;
            temp = temp.next;
        }
        newNode = newNode.next;
        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
}
