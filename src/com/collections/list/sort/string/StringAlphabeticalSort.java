package com.collections.list.sort.string;

import java.util.ArrayList;
import java.util.List;

public class StringAlphabeticalSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("panda");
        list.add("tom");
        list.add("doremon");
        list.add("sinchan");

        //Old way
//        list.sort((a,b) -> a.compareTo(b));

        //new way using METHOD REFERENCE
        list.sort(String::compareTo);

        System.out.println(list);
    }
}
