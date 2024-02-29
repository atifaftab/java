package com.arrays;

import java.util.Arrays;

public class SumOfIntegerArray {
    public static void main(String[] args){
        int[] arrNum = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i<arrNum.length; i++){
            sum+=arrNum[i];
        }
        System.out.println(sum);

        System.out.println(Arrays.stream(arrNum).sum());

    }
}
