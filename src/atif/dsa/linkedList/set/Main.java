package atif.dsa.linkedList.set;

public class Main {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist(0);
        linkedlist.append(1);
        linkedlist.append(2);
        linkedlist.append(3);

        linkedlist.printLinkedList();
        System.out.println("----- after ------");
        System.out.println(linkedlist.set1(0, 1));
        System.out.println(linkedlist.setUsingGet(1, 3));

        linkedlist.printLinkedList();
    }


}
