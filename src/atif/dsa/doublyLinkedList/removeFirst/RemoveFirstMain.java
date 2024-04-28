package atif.dsa.doublyLinkedList.removeFirst;

public class RemoveFirstMain {
    public static void main(String[] args) {
        RemoveFirst list = new RemoveFirst(1);
        list.append(2);
//        list.append(3);
        list.displayList();
        System.out.println("----");
        //remove 1
        System.out.println(list.removeFirst1().value);
        //remove 2
        System.out.println(list.removeFirst1().value);
        //remove null
        System.out.println(list.removeFirst1());

    }
}
