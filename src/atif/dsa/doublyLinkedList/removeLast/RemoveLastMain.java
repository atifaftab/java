package atif.dsa.doublyLinkedList.removeLast;

public class RemoveLastMain {
    public static void main(String[] args) {
        RemoveLast list = new RemoveLast(1);
        list.append(2);
        list.displayList();

        //removing 2
        System.out.println("2: " + list.removeLast().value);
        //removing 1

        System.out.println("1: " + list.removeLast().value);
        //removing null

        System.out.println("null: " + list.removeLast());
    }
}
