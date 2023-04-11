package com.arrays;

public class SubmProductAverageIntergerArray {

    public static void main(String[] args) {

        int[] intArr = new int[]{1, 2, -3, 5, 7};
        int sum = 0, product = 1;
        double average = 0.0;

        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
            product *= intArr[i];
        }
        average = (double) sum / intArr.length;
        
        System.out.println("sum : " + sum);
        System.out.println("product : " + product);
        System.out.println("average : " + average);
    }
}
