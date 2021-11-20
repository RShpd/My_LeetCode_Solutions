//Given an integer array [nums] and an integer [val],
// remove all occurrences of [val] in [nums] in-place.
// The relative order of the elements may be changed.

//Level: easy

//Runtime: 0 ms   It's the time when I saw the effect of reading and thinking about the discusses :)
//Memory Usage: 37.6 MB

public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int index = nums.length - 1;
        int i = 0;
        while (index >= i) {
            if (nums[i] == val) {
                nums[i] = nums[index--];
            } else {
                i++;
            }
        }
        return i;
    }

    public static void main(String args[]) {
        int[] testCase = {3, 2, 2, 3};
        int result = removeElement(testCase, 3);
        System.out.println(result);
    }
}
