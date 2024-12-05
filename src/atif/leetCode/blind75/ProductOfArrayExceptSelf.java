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
        System.out.println("=== better solution ====");
        System.out.println(Arrays.toString(productOfArrayExceptSelfMethod3(nums)));
        System.out.println("=== best solution ====");
        System.out.println(Arrays.toString(productOfArrayExceptSelfMethod4(nums)));
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

    //best solution
    private static int[] productOfArrayExceptSelfMethod3(int[] nums) {
        int[] productArr = new int[nums.length];
        Arrays.fill(productArr, 1);
        int pre = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            productArr[i] = pre;
            pre = nums[i] * pre;
        }
        for (int j = nums.length - 1; j >= 0; j--) {
            productArr[j] = productArr[j] * post;
            post = nums[j] * post;
        }
        return productArr;
    }
    private static int[] productOfArrayExceptSelfMethod4(int[] nums) {
        int[] productArr = new int[nums.length];
        Arrays.fill(productArr, 1);
        int current = 1;
        for (int i = 0; i < nums.length; i++) {
            productArr[i] = current;
            current *= nums[i];
        }
        current = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            productArr[j] *= current;
            current *= nums[j];
        }
        return productArr;
    }
}
