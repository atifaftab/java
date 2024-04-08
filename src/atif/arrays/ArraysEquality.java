package atif.arrays;

import java.util.Arrays;

public class ArraysEquality {
    //check both arrays are equals
    public static void main(String[] args) {
        int[] a = {30, 25, 40};
        int[] b = {30, 25, 40};

        boolean flag = false;
        if (a.length != b.length) {
            flag = false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
        }
        System.out.println(flag);


        if (Arrays.equals(a, b)) {
            System.out.println("both arrays are equals");
            return;
        }
        System.out.println("Not Equals");
    }
}
