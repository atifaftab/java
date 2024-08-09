package atif.dsa.linkedList.all.practice;

public class AllPracticeMain {
    public static void main(String[] args) {
        AllPractice list = new AllPractice(1);
        list.getHead();
        list.getTail();
        list.getLength();
        System.out.println("----- print list----");
        list.printList();
        list.append(2);
        list.append(3);
        list.append(4);
        System.out.println("----- after append----");
        list.printList();
        list.removeLast();
        System.out.println("----- after Remove Last----");
        list.printList();
        list.getLength();

    }
}
