package com.java8.streams.integers;

//Find duplicate element in given array list using stream

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateIntegerInList {
    public static void main(String[] args) {

        int[] num = new int[]{1,2,3,4,5,6,1,4,7,7};
//        for(int i=0; i< numbers.length; i++){
//            for(int j = i+1; j< numbers.length -1; j++){
//                if(numbers[i] == numbers[j])
//                    System.out.println(numbers[i]);
//            }

        // using hashset (because it does not store duplicate)
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for(int n: num){
            if(!unique.add(n))
                duplicate.add(n);
        }
        System.out.println(duplicate);

//        List<Integer> list = Arrays.asList(1,4,54,92,1,2,8,87,4);
//
//        for(Integer i: list){

    }
}
