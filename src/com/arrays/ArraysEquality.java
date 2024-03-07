package com.arrays;

import java.util.Arrays;

public class ArraysEquality {
    public static void main(String[] args) {
        int[] a = {30, 25, 40};
        int[] b = {30, 25, 40};

        if (Arrays.equals(a, b)) {
            System.out.println("both arrays are equals");
            return;
        }
        System.out.println("Not Equals");
    }
}
