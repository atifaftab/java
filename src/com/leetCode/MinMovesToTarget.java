/*Minimum Moves to Reach Target Score*/
package com.leetCode;

import java.util.Scanner;

public class MinMovesToTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter Target and Max double ");
        int target = in.nextInt();
        int maxDouble = in.nextInt();
        System.out.println(counter(target, maxDouble));
        in.close();
    }

    public static int counter(int target, int maxDoubles) {
        int c = 0;
        while (target > 0 && maxDoubles > 0) {
            if (target % 2 == 0) {
                maxDoubles --;
                target /= 2;
                c ++;
            } else {
                target --;
                c ++;
            }
        }
        return c + (target - 1);
    }
}
