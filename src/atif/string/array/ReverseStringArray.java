package atif.string.array;

import java.util.Arrays;

public class ReverseStringArray {
    public static void main(String[] args) {
        /*
          Please implement this method to
          reverse array where the order of elements has been reversed from the original
          array. E.g. given {"g", "l", "h", "f"}, result is {"f", "h", "l", "g"}
         */
        reverseArray(new String[]{"first", "second", "third", "fourth", "fifth", "sixth", "seventh"});
        reverseArray(new String[]{"g", "l", "h", "f"});
    }

    public static void reverseArray(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
