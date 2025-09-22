package Arrays;

public class TwoNumbersAddingToK {
    public static int[] findSum(int[] nums, int k) {
        int[] result = new int[2];  //result array containing two numbers
       for (int i = 0; i < nums.length; i++) {    //Two pointer approach
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of current pair equals the target sum (k)
                if (nums[i] + nums[j] == k) {
                    // If found, push the pair to the result array and return
                    result[0] = nums[i];
                    result[1] = nums[j];
                    return result;
                }
            }
        }
        return new int[0];
    }
}
