package atif.dsa.doublyLinkedList.get;

public class GetMain {
    public static void main(String[] args) {
        Get list = new Get(0);
        list.append(1);
        list.append(2);
        list.display();

        System.out.println("-----get----");
        System.out.println(list.get(2).value);
    }
}
