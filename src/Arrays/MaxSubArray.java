package Arrays;

public class MaxSubArray {
    public static int findMaxSumSubArray(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int currMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }

}
