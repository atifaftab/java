package com.arrays;

import java.util.Arrays;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {-1, 87, 343, 233, 0, -934};
        //normal way
        int max = arr[0];
        int main = arr[0];
        for (int n : arr) {
            max = Math.max(n, max);
        }
        System.out.println("largest = " + max);
        for (int n : arr) {
            if (n < max && n > main) {
                main = n;
            }
        }
        System.out.println("2nd largest = " + main);

        //by sorting
        Arrays.sort(arr);
        System.out.println("largest " + arr[arr.length - 1]);
        System.out.println("2nd largest " + arr[arr.length - 2]);

        //

    }
}
