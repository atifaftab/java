package atif.dsa.linkedList.all;

public class AllLinkedListMain {
    public static void main(String[] args) {
        AllLinkedList allLinkedList = new AllLinkedList(3);
        allLinkedList.prepEnd(2);
        allLinkedList.prepEnd(1);
        allLinkedList.appEnd(4);
        allLinkedList.appEnd(5);
        allLinkedList.printLinkedList();
        allLinkedList.getLength();

        System.out.println("------after removing last element ------");

        System.out.println("removed element : " + allLinkedList.removeLast().value);
        System.out.println("removed element : " + allLinkedList.removeLast().value);
        allLinkedList.getLength();

        System.out.println("------ rest of the element ------");
        allLinkedList.printLinkedList();
        allLinkedList.getLength();
        System.out.println("---removing first -------");
        System.out.println("removed element : " + allLinkedList.removeFirst().value);
        System.out.println("removed element : " + allLinkedList.removeFirst().value);
        System.out.println("removed element : " + allLinkedList.removeFirst().value);
        System.out.println("removed element : " + allLinkedList.removeFirst());
        allLinkedList.getLength();

        System.out.println("------ adding new elements ------");
        allLinkedList.prepEnd(2);
        allLinkedList.prepEnd(1);
        allLinkedList.prepEnd(0);
        allLinkedList.appEnd(3);
        allLinkedList.printLinkedList();
        allLinkedList.getLength();

        System.out.println("index at 2 : " + allLinkedList.get(2).value);

        System.out.println(allLinkedList.set(1, 5));
        allLinkedList.printLinkedList();
        System.out.println("-----re arranging ----");
        allLinkedList.set(1, 1);
        allLinkedList.printLinkedList();

        System.out.println("-----adding 4 at index 2 ----");
        System.out.println(allLinkedList.insert2(0, 4));
        allLinkedList.printLinkedList();


//        System.out.println("-----keeping correct form--------");
//        allLinkedList.remove(0);
//        allLinkedList.printLinkedList();

        System.out.println("-----removing from index  ----");
        System.out.println("removed node value : " + allLinkedList.remove(3));
        allLinkedList.printLinkedList();

        System.out.println("------reversing the linkedlist---");
        allLinkedList.reverse();
        allLinkedList.printLinkedList();


    }
}
