package com.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortIgnoringSpaces {
    public static void main(String[] args) {
        /*
          Please implement this method to
          sort a given array of Strings in alphabetical order
          ignoring spaces (' ' symbols) within the strings.
         */
        sortIgnoringSpaces(new String[]{" ", "test", "ABC", "why", "    ", "HLB", "webiste", "google", "1", "9", "-111"});
    }

    public static void sortIgnoringSpaces(String[] array) {
        Arrays.sort(array, Comparator.comparing((String s) -> s.replace(" ", "")));
        System.out.println(Arrays.toString(array));

    }
}
