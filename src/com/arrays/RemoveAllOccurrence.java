package com.arrays;

import java.util.Arrays;

public class RemoveAllOccurrence {
    public static void main(String[] args) {
        //remove all occurrence of an element from array
        int[] arr = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        System.out.println(Arrays.toString(arr));
        int[] copyArr = new int[arr.length];
        int num = 3;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {
                copyArr[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(copyArr));
    }
}
