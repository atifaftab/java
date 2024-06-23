package atif.dsa.doublyLinkedList.leetcode.swapPairs;

public class SwapPairsMain {
    public static void main(String[] args) {
        SwapPairs list = new SwapPairs(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.display();
        System.out.println("---------");
        list.swapPairs();
        list.display();
    }
}
