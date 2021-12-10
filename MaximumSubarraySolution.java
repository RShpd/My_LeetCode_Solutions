//Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.

public class MaximumSubarraySolution {
    private static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            max = Math.max(sum, max);
            if (sum <= 0) sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
