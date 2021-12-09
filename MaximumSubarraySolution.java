//Given an integer array nums, find the contiguous subarray (containing at least one number)
// which has the largest sum and return its sum.

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumSubarraySolution {
    private static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int arraySum;
        int sum;
        int end = nums.length - 1;
        int start = 0;

        sum = IntStream.of(Arrays.copyOfRange(nums, start, nums.length)).sum();
        arraySum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int a = Integer.MIN_VALUE;
            try {
                if (i == (end + 1)) a = nums[i];
                else a = IntStream.of(Arrays.copyOfRange(nums, i, end + 1)).sum();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            if (a > arraySum) {
                start = i;
                arraySum = a;
            }

            int b = Integer.MIN_VALUE;
            try {
                if (start == end - (i - 1)) b = nums[start];
                else b = IntStream.of(Arrays.copyOfRange(nums, start, end - (i - 1))).sum();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            if (b > arraySum) {
                end = end - i;
                arraySum = b;
            }
        }
        return Math.max(sum, arraySum);
    }

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}
