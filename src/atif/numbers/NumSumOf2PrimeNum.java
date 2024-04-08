package atif.numbers;
//number is sum of 2 prime number
public class NumSumOf2PrimeNum {
    public static void main(String[] args) {
        int num = 16;
        boolean flag = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (checkPrime(i)) {
                if (checkPrime(num - i)) {
                    System.out.println(num + " is sum of prime numbers " + i + " and " + (num - i));

                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println(num + " is not sum of 2 prime number ");
        }

    }

    public static Boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
