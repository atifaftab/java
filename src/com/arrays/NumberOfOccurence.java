package com.arrays;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 1, 1, 2, 2, 3, 4};
        int searchElement = 1;

        System.out.println(getNumberOcc(arrInt, searchElement));
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
}
