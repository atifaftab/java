package atif.dsa.doublyLinkedList.remove;

public class RemoveMain {
    public static void main(String[] args) {
        Remove remove = new Remove(0);
        remove.append(1);
        remove.append(2);
//        remove.append(3);
        remove.display();
        remove.remove(1);
        System.out.println("-------");
        remove.display();
    }

}
