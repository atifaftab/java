package com.leetCode.array;

public class ReduceToZero {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
//        while (num >= 0) {
//            if(num == 0)
//                return count;
//            boolean even = num % 2 == 0;
//            if (even) {
//                num = num / 2;
//                count++;
//            } else {
//                num = num - 1;
//                count++;
//            }
//        }

        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
        }
        return count;
    }
}
