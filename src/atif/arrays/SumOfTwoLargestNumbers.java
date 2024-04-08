package atif.arrays;

public class SumOfTwoLargestNumbers {
    public static void main(String[] args) {
        int[] array = {43, 12, 12, 44, 47, 9, 34, 58, 3, 11, 4, 21};
        sumOfTwoLargestNumbers(array);
    }
    private static void sumOfTwoLargestNumbers(int[] array) {
        int first, second;
        first = second = Integer.MIN_VALUE;
        for (int n : array) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("sum of two largest number = " + (first+second));
    }
}
