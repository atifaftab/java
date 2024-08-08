package atif.dsa.linkedList.all.practice;

public class AllPracticeMain {
    public static void main(String[] args) {
        AllPractice list = new AllPractice(1);
        list.getHead();
        list.getTail();
        list.getLength();
        list.printList();
        list.append(2);
        System.out.println("----- after append----");
        list.printList();

    }
}
