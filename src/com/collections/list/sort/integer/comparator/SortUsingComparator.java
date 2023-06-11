package com.collections.list.sort.integer.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
            @Override
            public int compare(Integer i, Integer j){
                if(i > j)
                    return 1;
                else return -1;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(32);
        list.add(36);
        list.add(4);
        list.add(0);

//        1st way
//        Collections.sort(list, com);

        //2nd way
        list.sort(com);
        System.out.println(list);

    }

}
