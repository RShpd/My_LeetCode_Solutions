//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
//Level: easy

//Runtime: 1 ms
//Memory Usage: 40.6 MB MB

public class RemoveDuplicatesSolution {
    public static int removeDuplicates(int[] nums) {
        int result = 0;
        final int invalidNum = -102;

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] == nums[i - 1]) {
                nums[i] = invalidNum;
                result++;
            }
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != invalidNum) {
                if (i > index) {
                    nums[index] = nums[i];
                    nums[i] = invalidNum;
                }
                index++;
            }
        }

        return nums.length - result;
    }

    public static void main(String args[]) {
        int[] testCase = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(testCase);
        System.out.println(result);
    }
}
