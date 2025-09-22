package Arrays;

public class EvenOddLargeSmall {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        if (n == 0) return nums;

        // Initialize pointers to the start and end of the array
        int maxIdx = n - 1;
        int minIdx = 0;
        // Initialize a variable larger than any element in the array to use for encoding
        int maxElem = nums[n - 1] + 1;

        // Encoding phase
        for (int i = 0; i < n; ++i) {
            if (i % 2 == 0) {  // Encoding at even indexes
                nums[i] += (nums[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } else {  // Encoding at odd indexes
                nums[i] += (nums[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

        // Decoding phase
        for (int i = 0; i < n; ++i) {
            nums[i] = nums[i] / maxElem;
        }

        return nums;
    }
}
