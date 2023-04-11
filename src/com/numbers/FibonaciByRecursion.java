package com.numbers;

public class FibonaciByRecursion {
    public static void main(String[] args) {

        int num = 1;
        System.out.println(fibonaci(num));
    }

    public static int fibonaci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonaci(num - 1) + fibonaci(num - 2);
    }

}
