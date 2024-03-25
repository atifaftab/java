package com.arrays;

import java.util.*;
import java.util.stream.Collectors;

//returns duplicates elements from array
public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 54, 86, 2, 9, 5, 1, 1};
        //using brute force with nested loop
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate = " + arr[i]);
            }
        }

        //using hashmap
        Set<Integer> unique = new LinkedHashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for (int n : arr) {
            if (!unique.add(n))
                duplicates.add(n);
        }
        System.out.println(duplicates);

//        Arrays.stream(arr)
//                .collect(Collectors.toSet());
//        System.out.println(Arrays.toString(integerList));


        System.out.println("---using java8-----");
        int[] arr1 = new int[]{2, 54, 3, 86, 2, 9,3, 5, 1, 1};

        Arrays.stream(arr1).distinct().forEach(System.out::println);

        //for comment
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("apple");
        listWithDuplicates.add("banana");
        listWithDuplicates.add("apple");

        List<String> listWithoutDuplicates = listWithDuplicates.stream()
                .distinct()
                .toList();
        listWithoutDuplicates.forEach(System.out::println);
    }
}
