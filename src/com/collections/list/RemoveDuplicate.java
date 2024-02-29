package com.collections.list;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(1,2,3,4,5,1,2,4,9);
//        List<Integer> list = new ArrayList<>();
//        list.addAll(l1);
//
//        //naive method (creating linkedHashset from list
//        Set<Integer> set = new LinkedHashSet<>();
//        set.addAll(list);
//        list.clear();
//        list.addAll(set);
//
//        System.out.println(list);

        //using distinct
        System.out.println(l1.stream().distinct().toList());

    }
}
