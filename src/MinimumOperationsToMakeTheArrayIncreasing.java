// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/

public class MinimumOperationsToMakeTheArrayIncreasing {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            while (nums[i] <= nums[i - 1]) {
                nums[i] += 1;
                count++;
            }
        }
        return count;
    }

    public int minOperations2(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i -1]);
            if (nums[i] <= nums[i - 1]) {
                nums[i] += diff + 1;
                count += diff + 1;
            }
        }
        return count;
    }
}
