package com.arrays;

import java.util.Arrays;

public class MissingNoInArray {
    public static void main(String[] args) {
        //find the missing number in the array
        int[] arr = {1, 5, 3, 2};
        int n = arr.length;
//        System.out.println("n = " + n);
//        System.out.println(Arrays.stream(arr).sum());
        Arrays.sort(arr);
        int b = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == b) {
                b++;
            }
        }
        System.out.println(b);

        System.out.println("---------");

//        Arrays.stream(arr).

        int sum = ((n + 1) * (n + 2)) / 2;
        for (int j : arr) {
            sum -= j;
        }
        System.out.println("the missing number is " + sum);
    }
}
