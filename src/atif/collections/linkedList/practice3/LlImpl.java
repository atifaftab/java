package atif.collections.linkedList.practice3;

public class LlImpl {

    Node head;

    void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    void show() {
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    void insertAtIndex(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n1 = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

        }
    }

}
