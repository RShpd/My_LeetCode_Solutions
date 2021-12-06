//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.

//I could fix my mistakes by checking problem's discussions
//Runtime: 0 ms
//Memory Usage: 38.5 MB

public class SearchInsertPositionSolution {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int pivot = (start + end) / 2;
            if (nums[pivot] == target) return pivot;

            else if (nums[pivot] > target) end = pivot - 1;
            else start = pivot + 1;
        }
        return ++end;
    }

    public static void main(String args[]) {
        int[] testCase = {1, 3, 5, 6};
        int result = searchInsert(testCase, 7);
        System.out.println(result);
    }
}
