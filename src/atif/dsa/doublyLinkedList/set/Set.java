package atif.dsa.doublyLinkedList.set;

public class Set {
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

    public Set(int value) {
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

    public void set(int index, int value) {
        if (index < 0 || index >= length) return;
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
        }
    }
}
