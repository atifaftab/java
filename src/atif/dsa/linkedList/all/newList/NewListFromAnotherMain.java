package atif.dsa.linkedList.all.newList;

public class NewListFromAnotherMain {
    public static void main(String[] args) {
        NewListFromAnother list = new NewListFromAnother(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.printAll();
        System.out.println("----- New LinkedList -------");
        list.newLinkedList();
    }
}
