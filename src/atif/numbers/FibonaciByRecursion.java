package atif.numbers;

public class FibonaciByRecursion {
    public static void main(String[] args) {

        int num = 10;
//        System.out.println(fibonaci(num));
        System.out.println(fibonaciSeries(10));
    }

    public static int fibonaci(int num) {
        if (num <= 1) {
            return num;
        }
        return fibonaci(num - 1) + fibonaci(num - 2);
    }

    public static int fibonaciSeries(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;     // fibonaci for 2 is also 1.   0 + 1  = 1
        return fibonaciSeries(n - 1) + fibonaciSeries(n - 2);
    }

}
