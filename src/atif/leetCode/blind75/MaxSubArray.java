package atif.leetCode.blind75;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    private static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (currSum < 0)
                currSum = 0;
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
}
