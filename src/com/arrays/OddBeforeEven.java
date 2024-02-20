package com.arrays;

import java.util.Arrays;

public class OddBeforeEven {
    //put odd numbers before even numbers
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 4, 5, 7, 9, -2, 3};

//        Arrays.sort(numbers);
        int[] copyArr = new int[numbers.length];
        int j = 0, k = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                copyArr[j++] = numbers[i];
            } else {
                copyArr[k--] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(copyArr));
    }
}
