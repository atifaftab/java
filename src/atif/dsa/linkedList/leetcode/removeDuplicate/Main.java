package atif.dsa.linkedList.leetcode.removeDuplicate;

public class Main {

    public static void main(String[] args) {

        RemoveDuplicate myLinkedList = new RemoveDuplicate(1);

        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();
        myLinkedList.removeDuplicates();
        System.out.println("---");
        myLinkedList.printList();
        /*
            EXPECTED OUTPUT:
            ----------------
            1
            2
            3
            4

        */

    }

}