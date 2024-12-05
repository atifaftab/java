package atif.leetCode.blind75;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.*/

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        System.out.println("=== brute force using division ====");
        System.out.println(Arrays.toString(productOfArrayExceptSelfMethod(nums)));
        System.out.println("=== brute force ====");
        System.out.println(Arrays.toString(productOfArrayExceptSelfMethod2(nums)));
    }

    //using division which is not allowed in this question
    private static int[] productOfArrayExceptSelfMethod(int[] nums) {
        int product = 1;
        int[] productArr = new int[nums.length];
        for (int n : nums) {
            product *= n;
        }
        for (int i = 0; i < nums.length; i++) {
            productArr[i] = product / nums[i];
        }
        return productArr;
    }

    //brute force
    private static int[] productOfArrayExceptSelfMethod2(int[] nums) {
        int[] productArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (!(i == j))
                    product = product * nums[j];
            }
            productArr[i] = product;
        }
        return productArr;
    }
}
