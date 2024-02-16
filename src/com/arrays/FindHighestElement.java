package com.arrays;

public class FindHighestElement {
    public static void main(String[] args) {

        int[] arr = new int[]{20, 4, 35, 1, 87, 7, 8, 9, 81, -85451};
        int max = -1;
        int main = -1;
//        for (int i = 0; i < arr.length; i++) {
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (main < max) {
                main = Math.max(main, i);
//                System.out.println("main = " + main);
            }
        }
//        System.out.println("max = " + max);
//        System.out.println("main = " + main);
        int smax = Integer.MIN_VALUE;
        int m = Integer.MIN_VALUE;
             
             
             
       /* for( int i=0; i< arr.length; i++) {
             smax= Math.max(arr[i],smax);
              if(smax<max){
                  m=Math.max(smax,arr[i]);
              }
        }



        System.out.println("m = " + m);*/


        // ---------------------------------------
       /* int index=-1;
        for( int i=0; i< arr.length; i++) {
            if(smax<arr[i]){
               smax=arr[i];
               index=i;
            }


        }
        arr[index]=Integer.MIN_VALUE;
        System.out.println("index = " + index);
        System.out.println("smax = " + smax);
        smax=Integer.MIN_VALUE;
        for( int i=0; i< arr.length; i++) {
            if(smax<arr[i]){
                smax=arr[i];
              //  index=i;
            }


        }
        System.out.println("smax = " + smax);*/

        int firstMax = Integer.MIN_VALUE;
        int secondMax;
        int tem = Integer.MIN_VALUE;
        for (int j : arr) {
            firstMax = Math.max(firstMax, j);
            secondMax = j;
            if (secondMax < firstMax) {
                tem = secondMax;
            }

        }
        System.out.println("firstMax = " + firstMax);
        System.out.println("tem = " + tem);
    }
}
