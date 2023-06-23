package com.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(fac(n));
    }

    static int fac(int num) {
        if(num <=0)
            throw new RuntimeException("no factorial for 0 or negative");
        if (num == 1)
            return 1;
        return num * (fac(num - 1));
    }

}
