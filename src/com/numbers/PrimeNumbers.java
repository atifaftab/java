package com.numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 13;
        if(primeNumber(num))
            System.out.println(num +" is prime");
        else System.out.println(num + " is not prime");
    }

    private static boolean primeNumber(int num){
        if (num <= 1) return false;
        for(int i=2; i<= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
