package com.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementsIn2List {
    public static void main(String[] args) {

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(8, 4, 7, 6));


        //naive method
//        List<Integer> temp = new ArrayList<>();
//        for(Integer n : num1){
//            if(num2.contains(n)){
//                temp.add(n);
//            }
//        }
//        System.out.println(temp);

//
//        num1.retainAll(num2);
//        System.out.println("common numbers " + num1);

        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        l1.add("hi");
        l1.add("hello");
        l1.add("hiiii");

        l2.add("hi");
        l2.add("ello");
        l2.add("iiii");

        //using pre built api
//        l1.retainAll(l2);
//        System.out.println("common string " + l1);


        //using lambda
        //l1.stream().filter(i -> l2.contains(i)).toList()
//        System.out.println(l1.stream().filter(i -> l2.contains(i)).toList());

        //using method reference operator
//        l1.stream().filter(l2::contains).collect(Collectors.toList());
        System.out.println(l1.stream().filter(l2::contains).toList());



    }
}
