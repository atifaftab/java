package atif.dsa.linkedList.all.practice.parition;

public class PartitionLinkedListMain {
    public static void main(String[] args) {
        PartitionLinkedList list = new PartitionLinkedList(3);
        list.append(8);
        list.append(5);
        list.append(10);
        list.append(2);
        list.append(1);
        list.allPrint();
        list.partitionList(5);
        list.allPrint();
    }
}
