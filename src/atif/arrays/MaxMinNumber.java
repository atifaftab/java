package atif.arrays;

import java.util.Arrays;

public class MaxMinNumber {
    public static void main(String[] args) {
        // find maximum and minimum number
        int[] arrNum = new int[]{2, 4, 6, -3, 5};
        int max = arrNum[0];
        int min = arrNum[0];

        for (int i = 0; i < arrNum.length; i++) {
            max = (arrNum[i] > max) ? arrNum[i] : max;
            min = (arrNum[i] < min) ? arrNum[i] : min;
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);


        System.out.println("---------");
        for (int e : arrNum) {
            max = Math.max(max, e);
            min = Math.min(min, e);
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        System.out.println("---------");

        System.out.println(Arrays.stream(arrNum).max().getAsInt());
        System.out.println(Arrays.stream(arrNum).min().getAsInt());
    }
}
