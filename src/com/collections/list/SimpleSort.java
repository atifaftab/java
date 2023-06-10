package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleSort {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(32);
        list.add(36);
        list.add(4);
        list.add(0);

        // 1st way
//        Collections.sort(list);

        //using comparator
        list.sort(Comparator.naturalOrder());
        System.out.println(list);

    }
}
