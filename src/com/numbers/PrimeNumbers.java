package com.numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 9;
        int half = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not prime number");
        } else {
            for (int i = 2; i <= half; i++) {
                if (num % i != 0) {
                    System.out.println(num + " is prime");
                }
            }
        }
    }
}
