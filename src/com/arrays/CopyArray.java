package com.arrays;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 53, 76, 2, 0};
        System.out.println("original array");
        System.out.println(Arrays.toString(arr));

        //traditional method
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(copyArr));

        //System,arraycopy
        int[] copyArr1 = new int[arr.length];
        System.arraycopy(arr, 0, copyArr1, 0, arr.length);
        System.out.println(Arrays.toString(copyArr1));

        //using clone
        int[] copyArr2 = arr.clone();
        System.out.println(Arrays.toString(copyArr2));

        //Arrays.copyOf(), Arrays.copyOf(original Array, length of new array)
        int[] copyArr3 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr3));

        //Arrays.copyOfRange(), Arrays.copyOfRange(original Array, from, to)
        int[] copyArr4 = Arrays.copyOfRange(arr, 0, arr.length);
        System.out.println(Arrays.toString(copyArr4));
        System.out.println(arr.length);
        System.out.println(copyArr4.length);

    }
}
