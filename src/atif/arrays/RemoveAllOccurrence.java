package atif.arrays;

import java.util.*;

public class RemoveAllOccurrence {
    public static void main(String[] args) {
        //remove all occurrence of an element from array
        int[] arr = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        System.out.println(Arrays.toString(arr));
//        int[] copyArr = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        int num = 3;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {
//                copyArr[i] = arr[i];
                list.add(arr[i]);
            }
        }
        System.out.println(list);


        Integer[] arr1 = {3, 9, 2, 3, 1, 7, 2, 3, 5};
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> finalList = list1.stream().filter(i -> i != num).toList();
//        Arrays.stream(arr).filter(i -> i!=num).collect()
//        finalList.forEach(System.out::println);
        System.out.println("finalList = " + finalList);
    }
}
