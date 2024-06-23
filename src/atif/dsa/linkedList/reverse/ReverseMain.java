package atif.dsa.linkedList.reverse;

public class ReverseMain {
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList(0);
        list.appEnd(1);
        list.appEnd(2);
        list.appEnd(3);
        list.printLinkedList();
        System.out.println("-------");
        list.reverse();
        list.printLinkedList();
    }

}
