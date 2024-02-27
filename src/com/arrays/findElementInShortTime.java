package com.arrays;

import java.util.Scanner;

public class findElementInShortTime {
    //find an element in an array in O(n/2) time complexity
    public static void main(String[] args) {
        int[] arrNum = new int[]{4, 54, 246, 85, 3};
        Scanner in = new Scanner(System.in);
        int element = 54;
        element = in.nextInt();
        int k = arrNum.length - 1;
        for (int i = 0; i < arrNum.length / 2; i++) {
            if (element == arrNum[i]) {
                System.out.println(arrNum[i]);
                break;
            }
            if (element == arrNum[k]) {
                System.out.println(arrNum[k]);
                break;
            }
            k--;
        }
    }
}
