package atif.dsa.doublyLinkedList.append;

public class AppendMain {
    public static void main(String[] args) {
        Append list = new Append(1);
        list.printList();
        System.out.println("------");
        list.append(2);
        list.printList();
    }
}
