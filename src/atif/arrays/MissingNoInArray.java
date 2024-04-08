package atif.arrays;

import java.util.Arrays;

public class MissingNoInArray {
    public static void main(String[] args) {
        //find the missing number in the array
        int[] arr = {1, 5, 3, 4, 2, -2, 0};
//        int n = arr.length;
        Arrays.sort(arr);
        int b = arr[0];
        for (int j : arr) {
            if (j == b) {
                b++;
            }
        }
        System.out.println(b);
    }
}
