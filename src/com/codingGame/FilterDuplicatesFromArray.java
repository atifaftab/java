package com.codingGame;

import java.util.*;

//returns containing the values of input array without duplicate, initial order must be kept
public class FilterDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 8, 2, 7, 3, 9, 6, 9, 1, 4, 2};
        System.out.println(Arrays.toString(filterDuplicates(arr)));
    }

    public static int[] filterDuplicates(int[] arr) {

        //using the old java way
//        int[] a = new int[arr.length];
//        for(int i = 0; i<= arr.length;i++){
//            for(int j = i+1; j< arr.length-1;j++){
//                if(arr[i] != arr[j]){
//                    a[i] = arr[j];
//                }
//            }
//        }
//        return a;



        //using linkedHashset
        LinkedHashSet<Integer> unique = new LinkedHashSet<>();

        for(Integer n : arr){
            unique.add(n);
        }
        return unique.stream().mapToInt(Integer::intValue).toArray();

    }
}
