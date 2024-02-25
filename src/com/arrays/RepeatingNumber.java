package com.arrays;

import java.util.HashSet;

public class RepeatingNumber {
    public static void main(String[] args) {
        int[] arrNum = new int[]{1, 2, 3, 1, 2};
        System.out.println("repeating number(s) ");
//        for (int i = 0; i < arrNum.length; i++) {
//            for (int j = i + 1; j < arrNum.length; j++) {
//                if (arrNum[i] == arrNum[j]) {
//                    System.out.println(arrNum[i]);
//                }
//            }
//        }

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Boolean flag = false;

//        for (int i = 0; i < arrNum.length; i++) {
//            if (uniqueNumbers.contains(arrNum[i])) {
//                System.out.println(arrNum[i]);
//            } else uniqueNumbers.add(arrNum[i]);
//        }

        for (int j : arrNum) {
            if (uniqueNumbers.contains(j)) {
                System.out.println(j);
            } else uniqueNumbers.add(j);
        }

    }
}
