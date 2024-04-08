package atif.arrays;

import java.util.Arrays;

public class FindSecondLargest {
    public static void main(String[] args) {
        int[] arr = {-1, 87, 343, 233, 0, -934};
        //normal way
        int max = arr[0];
        int main = arr[0];
        for (int n : arr) {
            max = Math.max(n, max);
        }
        System.out.println("largest = " + max);
        for (int n : arr) {
            if (n < max && n > main) {
                main = n;
            }
        }
        System.out.println("2nd largest = " + main);

        //by sorting
        Arrays.sort(arr);
        System.out.println("largest " + arr[arr.length - 1]);
        System.out.println("2nd largest " + arr[arr.length - 2]);

        //by using 1 loop
        int i, first, second;
        first = second = Integer.MIN_VALUE;
        if (arr.length < 2) {
            System.out.println("Invalid ");
            return;
        }
//        for (i = 0; i < arr.length; i++) {
//            if (arr[i] > first) {
//                second = first;
//                first = arr[i];
//            } else if (arr[i] > second && arr[i] != first) {
//                second = arr[i];
//            }
//        }

        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("first " + first);
        System.out.println("second " + second);

    }
}
