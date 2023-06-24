package com.codingGame;

import java.util.*;

//returns containing the values of input array without duplicate, initial order must be kept
public class FilterDuplicatesFromArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 8, 2, 7, 3, 9, 6, 9, 1, 4, 2};
        System.out.println(Arrays.toString(filterDuplicates(arr)));
    }

    public static int[] filterDuplicates(int[] arr) {

        Set<Integer> unique = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int n : arr) {
            if (!unique.add(n)) {
                list.add(n);
            }
        }
//        System.out.println(list);
        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
