package atif.dsa.stack;

public class StackDemo {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public StackDemo(int value) {
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        System.out.println("Stack: ");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("top: " + top.value);
    }

    public void getHeight() {
        System.out.println("height: " + height);
    }

    public void push(int value) {
        Node stack = new Node(value);
        if (top == null) {
            top = stack;
        } else {
            stack.next = top;
            top = stack;
        }
        height++;
    }

    public Node pop() {
        if (height == 0) return null;
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }
}
