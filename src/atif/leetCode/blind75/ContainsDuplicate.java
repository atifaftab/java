package atif.leetCode.blind75;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        int[] num = new int[]{2, 45, 2, 36, 78, 1, 9, 4};
        int[] num = new int[]{1,8,9,5,9};
//        int[] num = new int[]{1, 2, 3, 1};
//        int[] num = new int[]{1, 2, 3, 4};
//        int[] num = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(num));
        System.out.println(containsDuplicate2(num));
        System.out.println("===== using set ====");
        System.out.println(containsDuplicate3(num));
    }

    //brute force O(n2)
    private static boolean containsDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j])
                    return true;
            }
        }
        return false;
    }

    //better solution  O(nlogn)
    private static boolean containsDuplicate2(int[] num) {
        Arrays.sort(num);
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1])
                return true;
        }
        return false;
    }


    //best solution  O(n)
    private static boolean containsDuplicate3(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int n: num) {
            if (!set.add(n))
                return true;
        }
        return false;
    }

}
