package com.string;

public class GetSumOfNumbers {
    public static void main(String[] args) {
        /*
          Please implement this method to
          calculate the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
        String s = "12 some text 3  7";
        getSumOfNumbers(s);

    }

    public static void getSumOfNumbers(String s) {
        int sum = 0;
        String temp = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                temp += c;
            } else if (!temp.isEmpty()) {
                sum += Integer.parseInt(temp);
                temp = "";
            }
        }
        if (!temp.isEmpty()) sum += Integer.parseInt(temp);
        System.out.println("sum = " + sum);
    }
}
