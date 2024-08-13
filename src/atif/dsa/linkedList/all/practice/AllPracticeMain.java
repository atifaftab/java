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
        System.out.println("Removed Node: " + list.removeLast().value);
        System.out.println("----- after Remove Last----");
        list.printList();
        list.getLength();
        System.out.println("----- Prepend----");
        list.prepend(0);
        list.printList();
        System.out.println("----- Remove First ----");
        System.out.println("removed Node: " + list.removeFirst().value);
        list.printList();
        System.out.println("----- Get  ----");
        list.prepend(0);
        list.getLength();
        System.out.println(list.get(2).value);
        System.out.println("----- Set  ----");
        System.out.println(list.set(3, 2));
        list.printList();
        System.out.println("----- insert  ----");
        System.out.println(list.insert(3, 3));
        list.printList();
        System.out.println("----- insert  ----");
        System.out.println(list.insert(4, 4));
        list.printList();


    }
}
