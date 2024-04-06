package com.dsa.linkedList.leetcode.findKthFromEnd;

public class FindKthFromEndMain {
    public static void main(String[] args) {
        FindKthFromEnd findKthFromEnd = new FindKthFromEnd(1);
        findKthFromEnd.append(2);
        findKthFromEnd.append(3);
        findKthFromEnd.append(4);
        findKthFromEnd.append(5);

        System.out.println(findKthFromEnd.findKthFromEnd(-2));
    }
}
