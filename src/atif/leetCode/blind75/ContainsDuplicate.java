package atif.leetCode.blind75;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] num = new int[]{2, 45, 2, 36, 78, 1, 9, 4};
        System.out.println(containsDuplicate(num));
        System.out.println("===== using set ====");
        System.out.println(containsDuplicate2(num));
    }

    //brute force
    private static boolean containsDuplicate(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j])
                    return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicate2(int[] num) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (!set.add(num[i]))
                return true;
        }
        return false;
    }

}
