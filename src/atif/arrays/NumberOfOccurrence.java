package atif.arrays;

import java.util.Arrays;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 1, 1, 2, 2, 3, 4};
        int searchElement = 6;

        System.out.println("number of occurrence " + getNumberOcc(arrInt, searchElement));
        if (get1stPosition(arrInt, searchElement) >= 0)
            System.out.println("1st occurrence at index " + get1stPosition(arrInt, searchElement));
        else System.out.println("doesn't not exist");
        System.out.println("-----");
        System.out.println(Arrays.stream(arrInt).anyMatch(i -> i == searchElement));
    }

    public static int getNumberOcc(int[] numberArr, int searchElement) {
        int occ = 0;
        for (int i = 0; i < numberArr.length; i++) {
            if (searchElement == numberArr[i]) {
                occ++;
            }

        }
        return occ;
    }

//    public static int get1stPosition(int[] numberArr, int searchElement) {
//        int position = 0;
//        for (int i = 0; i < numberArr.length; i++) {
//            if (searchElement == numberArr[i]) {
//                position = i;
//                break;
//            }
//        }
//        return position;
//    }

    //code improvement
    public static int get1stPosition(int[] numberArr, int searchElement) {
        for (int i = 0; i < numberArr.length; i++) {
            if (searchElement == numberArr[i])
                return i;
        }
        return -1;
    }
}
