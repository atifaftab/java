package com.arrays;

import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 6, 7};

        int sum = 0;


//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("The sum of array is " + sum);


        //2nd method
//        for (int n : arr) {
//            sum += n;
//        }
//        System.out.println("The sum of array is : " + sum);


        List<Integer> list = Arrays.stream(arr).boxed().toList();
        System.out.println(list.stream().reduce(0, (Integer::sum)));


    }
}
