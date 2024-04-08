package atif.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//find the sum of the even numbers in a list
public class SumOfEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(14,65,23,9,4,2);

        //old way
        var sum = 0;
        for(int n : list){
            if(n%2==0){
                sum+=n;
            }
        }
        System.out.println(sum);


    }
}
