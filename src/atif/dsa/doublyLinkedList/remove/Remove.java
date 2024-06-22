package atif.dsa.doublyLinkedList.remove;

public class Remove {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    Remove(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    void append(int value) {
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

    void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            return;
        }
        head.prev = node;
        node.next = head;
        head = node;
        length++;
    }

    Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    Node get(int index) {
        if (index < 0 || index > length) return null;
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

    Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        //brute force
//        Node temp = head;
//        if (index < length / 2) {
//            for (int i = 0; i < index; i++) {
//                temp = temp.next;
//            }
//        } else {
//            temp = tail;
//            for (int i = length - 1; i > index; i--) {
//                temp = temp.prev;
//            }
//        }
//        Node pre = temp.prev;
//        Node post = temp.next;
//        pre.next = post;
//        post.prev = pre;
//        temp.next = null;
//        temp.prev = null;



        //better method
//        Node temp = get(index);
//            Node pre = temp.prev;
//            Node post = temp.next;
//            pre.next = post;
//            post.prev = pre;
//            temp.next = null;
//            temp.prev = null;


        //without using extra variable
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;


        length--;
        return temp;
    }
}
