package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fac(n));
    }

    static int fac(int num) {
        if (num == 1 && num == 1)
            return 1;
        return num * (fac(num - 1));
    }

}
