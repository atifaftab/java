package atif.arrays;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] num = new int[]{11,25,4,36,95};

        //naive way
//        int max = num[0];
//        for(Integer n: num){
//            if(n > max)
//                max = n;
//        }
//        System.out.println(max);

        //using sort
//        Arrays.stream(num).sorted();
//        System.out.println(num[num.length-1]);

        //latest  java 8
        System.out.println(Arrays.stream(num).max().getAsInt());

    }
}
