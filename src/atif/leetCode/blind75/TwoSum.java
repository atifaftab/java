package atif.leetCode.blind75;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
        You may assume that each input would have exactly one solution, and you may not use the same element twice.
        You can return the answer in any order.
        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].*/
public class TwoSum {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int[] nums = {5, 7, 4, 15, 8, 34};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        System.out.println(Arrays.toString(twoSumMethod3(nums, target)));
    }


    //best method
    private static int[] twoSumMethod(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff))
                return new int[]{map.get(diff), i};
            map.put(nums[i], i);
        }
        return null;
    }

    //brute force

    private static int[] twoSumMethod2(int[] nums, int target) {
//        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static int[] twoSumMethod3(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
