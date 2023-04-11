package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NIntegersArrays {
    public static void main(String[] args) {

        int[] arrInt = new int[5];
        Scanner in = new Scanner(System.in);

        System.out.println("enter the elements of Array upto 5 digits :");
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = in.nextInt();
        }

        System.out.println("The entered :  " + Arrays.toString(arrInt));


    }
}
