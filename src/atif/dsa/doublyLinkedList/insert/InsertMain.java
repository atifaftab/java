package atif.dsa.doublyLinkedList.insert;

public class InsertMain {
    public static void main(String[] args) {
        Insert insert = new Insert(1);
        insert.append(3);
        insert.display();
        System.out.println("------");
        insert.insert(1, 2);
        insert.display();
    }
}
