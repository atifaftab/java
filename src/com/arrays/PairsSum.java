package com.arrays;

public class PairsSum {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 9;

//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                if ((numbers[i] + numbers[j]) == k) {
//                    System.out.println(numbers[i] + ", " + numbers[j]);
//                }
//            }
//        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    System.out.println("Sum of " + numbers[i] + " and " + numbers[j] + " is equal to  " + k);
                }
            }
        }
    }
}
