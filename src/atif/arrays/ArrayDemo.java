package atif.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n------------");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");
        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.toString());
    }
}
