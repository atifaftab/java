package com.arrays;

import java.util.Arrays;

public class PairsSum {
    //check that 2 elements of the array are equals to given number(k)
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 9;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == k) {
//                    System.out.println("Sum of " + numbers[i] + " and " + numbers[j] + " is equal to  " + k);
//                }
//            }
//        }
        System.out.println(findSumOfPairs(numbers, k));
    }

    //better solution
    //time Complexity : O(nlogn), space complexity: O(1)
    private static boolean findSumOfPairs(int[] numbers, int k) {
        //better solution
        Arrays.sort(numbers);
        var left = numbers[0];
        var right = numbers[numbers.length - 1];
        while (left < right) {
            if (left + right == k) return true;
            else if (left + right < k) left++;
            else right++;
        }
        return false;
    }
}
