package atif.numbers;

import java.util.stream.IntStream;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 97;
        if (primeNo(num))
            System.out.println(num + " is prime");
        else System.out.println(num + " is not prime");
    }

    private static boolean primeNumber(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    //using lambda
    private static boolean primeNo(int num) {
        return num > 1 && IntStream.range(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
    }
}
