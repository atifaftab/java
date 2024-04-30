package atif.dsa.doublyLinkedList.set;

public class SetMain {
    public static void main(String[] args) {
        Set list = new Set(0);
        list.append(1);
        list.append(4);
        list.append(3);
        list.display();
        System.out.println("------");
        list.set(2, 2);
        list.display();
    }
}
