package atif.dsa.doublyLinkedList.removeFirst;

public class RemoveFirstMain {
    public static void main(String[] args) {
        RemoveFirst list = new RemoveFirst(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.displayList();
        System.out.println("----");
        list.removeFirst();
        list.displayList();

    }
}
