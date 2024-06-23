package atif.dsa.doublyLinkedList.leetcode.palindrome;

public class PalindromeDoublyLinkedList {

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

    PalindromeDoublyLinkedList(int value) {
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

    public boolean palindrome() {
        if (length <= 1) return true;
        Node temp = head;
        int num = 0, sum = 0;
        int tempNum = 0;
        while (temp != null) {
            num = (num * 10) + temp.value;
            temp = temp.next;
        }
        tempNum = num;
        while (num > 0) {
            int i = num % 10;
            sum = (sum * 10) + i;
            num /= 10;
        }
        if (tempNum == sum) return true;
        return false;
    }

    public boolean palindrome2() {
        if (length <= 1) return true;
        Node forward = head;
        Node backward = tail;
        for (int i = 0; i < length / 2; i++) {
            if (forward.value != backward.value) return false;
            forward = forward.next;
            backward = backward.prev;
        }
        return true;
    }
}
