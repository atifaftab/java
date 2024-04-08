package atif.dsa.linkedList.all;

public class AllLinkedList {
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

    AllLinkedList(int value) {
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

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
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

    public Node removeFirst() {
        if (length == 0) return null;
        Node firstNode = head;
        head = head.next;
        firstNode.next = null;
        length--;
        if (length == 0) tail = null;
        return firstNode;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepEnd(value);
            return true;
        }
        if (index == length) {
            appEnd(value);
            return true;
        }
        Node node = new Node(value);
        Node temp = head;
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = node;
        node.next = temp;
        length++;
        return true;
    }

    //better method
    public boolean insert2(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepEnd(value);
            return true;
        }
        if (index == length) {
            appEnd(value);
            return true;
        }
        Node node = new Node(value);
        Node temp = get(index - 1);
        node.next = temp.next;
        temp.next = node;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) removeFirst();
        if (index == length - 1) removeLast();
        Node temp = head;
        Node pre = head;
        for (int i = 0; i < index; i++) {
            pre = temp;
            temp = temp.next;
        }
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node remove2(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
