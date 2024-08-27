package atif.dsa.linkedList.all.practice.removeDuplicate;

public class RemoveDuplicateLinkedListMain {
    public static void main(String[] args) {
        RemoveDuplicateLinkedList list = new RemoveDuplicateLinkedList(1);
        list.append(2);
        list.append(3);
        list.append(1);
        list.append(4);
        list.append(2);
        list.append(5);
        list.printList();
        System.out.println("---- removing dublicate -------");
        list.removeDuplicate();
        list.printList();
    }
}
