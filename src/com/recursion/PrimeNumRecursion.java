package com.recursion;

import java.util.Scanner;

public class PrimeNumRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int num = in.nextInt();
        if (primeNumber(num, 2)) System.out.println(num + " is prime number");
        else System.out.println(num + " is not prime number");
    }

    public static boolean primeNumber(int num, int i) {
        if (num <= 1) return false;
        if (i < num) {
            if (num % i != 0) return primeNumber(num, ++i);
            else return false;
        } else return true;
    }
}
