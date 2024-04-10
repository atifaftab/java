package atif.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Original " + Arrays.toString(numbers));

        int[] reverseArray = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reverseArray[i] = numbers[numbers.length - i - 1];
        }
        System.out.println("reverse: " + Arrays.toString(reverseArray));

        System.out.println("-----");

        // 1st solution  by   reverse printing

        /*System.out.print("the reverser String [");
        for (int i = numbers.length; i > 0; i--) {
            System.out.print(i + ", ");
        }
        System.out.println("]");*/


        // 2nd solution  by swaping element from 1st to last
/*        int k = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
            k--;
        }*/
//        System.out.println(Arrays.toString(numbers));

//        System.out.println("------");

        //  2nd solution  another way

        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println("Reverse  " + Arrays.toString(numbers));


        // 3rd solution  by copying values to opposite index in temporary Array

     /*   int temp[] = new int[numbers.length];
        int k = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            temp[k++] = numbers[i];
        }
        System.out.println("Reverse " + Arrays.toString(temp));*/

    }
}
