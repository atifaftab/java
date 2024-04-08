package atif.dsa.linkedList.get;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(0);
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        linkedList.displayLinkedList();

        System.out.println("the required " + linkedList.get(2).data);
    }
}
