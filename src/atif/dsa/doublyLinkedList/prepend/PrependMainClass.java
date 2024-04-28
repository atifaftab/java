package atif.dsa.doublyLinkedList.prepend;

public class PrependMainClass {
    public static void main(String[] args) {
        Prepend list = new Prepend(1);
        list.displayList();
        System.out.println("---");
        list.prepend(0);
        list.prepend(-1);
        list.displayList();
    }

}
