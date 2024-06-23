package atif.dsa.doublyLinkedList.leetcode.palindrome;

public class PalindromeDoublyLinkedListMain {
    public static void main(String[] args) {
        PalindromeDoublyLinkedList list = new PalindromeDoublyLinkedList(1);
        list.append(2);
        list.append(1);
        list.display();
        System.out.println("--------");
        System.out.println(list.palindrome2());
    }

}
