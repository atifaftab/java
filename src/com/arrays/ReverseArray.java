package com.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original " + Arrays.toString(numbers));

        // 1st solution  by   reverse printing

        /*System.out.print("the reverser String [");
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("]");*/


        // 2nd solution  by swaping element from 1st to last
/*        int k = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
            k--;
        }*/
//        int k = numbers.length - 1;
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[k];
//            numbers[k] = temp;
//            k--;
//        }
//        System.out.println(Arrays.toString(numbers));

//        System.out.println("------");
//
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[numbers.length - i - 1];
//            numbers[numbers.length - i - 1] = temp;
//        }
//        System.out.println(Arrays.toString(numbers));

        //  2nd solution  another way

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Reverse  " + Arrays.toString(numbers));


        // 3rd solution  by copying values to opposite index in temporary Array

     /*   int temp[] = new int[numbers.length];
        int k = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            temp[k++] = numbers[i];
        }
        System.out.println("Reverse " + Arrays.toString(temp));*/

    }
}
