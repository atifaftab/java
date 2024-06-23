package atif.dsa.doublyLinkedList.reverse;

public class ReverseDoublyLinkedListMain {
    public static void main(String[] args) {
        ReverseDoublyLinkedList list = new ReverseDoublyLinkedList(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.display();
        System.out.println("------");
        list.reverse();
        list.display();
    }
}
