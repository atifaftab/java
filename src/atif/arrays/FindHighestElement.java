package atif.arrays;

import java.util.Arrays;
import java.util.Map;

public class FindHighestElement {
    public static void main(String[] args) {

        int[] arr = new int[]{20, 3424, 35, 1, 87, 7, 8, 9, 81, -85451, 347};
        int max = arr[0];
//        int main = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max = " + max);

        //using Math.max
        int max2 = arr[0];
        for (int n : arr) {
            max2 = Math.max(n, max2);
        }
        System.out.println("max2 = " + max2);

        System.out.println(Arrays.stream(arr).max().getAsInt());


//        int smax = Integer.MIN_VALUE;
//        int m = Integer.MIN_VALUE;
             
             
             
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

//        int firstMax = Integer.MIN_VALUE;
//        int secondMax;
//        int tem = Integer.MIN_VALUE;
//        for (int j : arr) {
//            firstMax = Math.max(firstMax, j);
//            secondMax = j;
//            if (secondMax < firstMax) {
//                tem = secondMax;
//            }
//
//        }
//        System.out.println("firstMax = " + firstMax);
//        System.out.println("tem = " + tem);
    }
}
