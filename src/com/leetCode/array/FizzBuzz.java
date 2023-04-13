/*Given an integer n, return a string array answer (1-indexed) where:

        answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
        answer[i] == "Fizz" if i is divisible by 3.
        answer[i] == "Buzz" if i is divisible by 5.
        answer[i] == i (as a string) if none of the above conditions are true.*/

package com.leetCode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = in.nextInt();

        List<String> list = new ArrayList<>(num);

        for (int i = 1; i <= num; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 && divisibleBy5) {
                list.add("FizzBuzz");
            } else if (divisibleBy3) {
                list.add("Fizz");
            } else if (divisibleBy5) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
    }
}
