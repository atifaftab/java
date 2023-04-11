package com.java8.loops.forEachloop;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(i -> System.out.println(i));
    }
}
