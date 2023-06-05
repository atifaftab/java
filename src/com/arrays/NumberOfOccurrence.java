package com.arrays;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int[] arrInt = new int[]{1, 1, 1, 2, 2, 3, 4};
        int searchElement = 1;

        System.out.println("number of occurrence "+getNumberOcc(arrInt, searchElement));
        System.out.println("1st occurrence at index "+get1stPosition(arrInt,searchElement));
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

    public static int get1stPosition(int[] numberArr, int searchElement){
        int position = 0;
        for(int i=0; i< numberArr.length; i++){
            if(searchElement == numberArr[i]){
                position = i;
                break;
            }
        }
        return position;
    }
}
