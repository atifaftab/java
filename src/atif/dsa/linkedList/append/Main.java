package atif.dsa.linkedList.append;

public class Main {
    public static void main(String[] args) {

        AppEndLinkedList linkedList = new AppEndLinkedList(1);

        linkedList.appEnd(2);


        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast().value);
        System.out.println(linkedList.removeLast());

        //linkedList.displayLinkedList();

    }
}
