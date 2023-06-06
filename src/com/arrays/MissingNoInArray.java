package com.arrays;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class MissingNoInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2};
        int n=arr.length;
        Arrays.sort(arr);
        int b=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==b)
            {
                b++;
            }
        }
        System.out.println(b);
    }
}
