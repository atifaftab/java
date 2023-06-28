package com.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//returns duplicates elements from array
public class FindDuplicates {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 54, 86, 2, 9, 5, 1, 1};
        Set<Integer> unique = new LinkedHashSet<>();
        List<Integer> duplicates = new ArrayList<>();

        for (int n : arr) {
            if (!unique.add(n))
                duplicates.add(n);
        }
        System.out.println(duplicates);
    }
}
