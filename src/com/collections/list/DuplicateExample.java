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

        //Gemini
        List<Integer> list1 = list.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("list1 = " + list1);

        //chatGpt
        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i))
                .entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
//                .map(entry -> entry.getKey())
                .map(Map.Entry::getKey)
                .toList();

        System.out.println("Duplicates: " + duplicates);

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> dupsSet = list.stream().filter(n -> !set1.add(n)).collect(Collectors.toSet());
//        System.out.println("dupsSet = " + dupsSet);
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> dubSet = list.stream().filter(n ->!set2.add(n)).collect(Collectors.toSet());
        System.out.println("dubSet = " + dubSet);
    }

}
