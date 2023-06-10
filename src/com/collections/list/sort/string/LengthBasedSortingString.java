package com.collections.list.sort.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LengthBasedSortingString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("panda");
        list.add("tom");
        list.add("doremon");
        list.add("sinchan");

        //old method
        //list.sort((a,b) -> a.length() - b.length());
        //list.sort((a,b) -> a.compareTo(b));


        // new method
//        list.sort(Comparator.comparingInt(String::length));
//        list.sort(String::compareTo);
        System.out.println(list);
    }
}
