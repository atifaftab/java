package com.collections.list;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateExample {
    //find duplicate in list
    public static void main(String[] args) {


        List<Integer> list = List.of(54, 25, 1, 8, 25, 6, 7, 54);
        List<Integer> unique = new ArrayList<>();
        HashSet<Integer> duplicate = new HashSet<>();
        for (int n : list) {
            if (!duplicate.add(n)) {
                unique.add(n);
            }
        }
        System.out.println(unique);

        List<Integer> list1 = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("list1 = " + list1);


        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
//                .map(entry -> entry.getKey())
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates: " + duplicates);
    }

}
