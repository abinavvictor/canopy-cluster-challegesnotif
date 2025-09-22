package Arrays;

public class Rightrotate {

    public static int[] rightRotate(int[] nums, int k) {
        // Determine rotation index
        if (nums.length == 0) {
            k = 0;  // If the list is empty, no rotation needed
        } else {
            k = k % nums.length;  // Calculate effective rotation amount
        }

        // Perform rotation by slicing the array
        int[] rotatedArray = new int[nums.length];
        System.arraycopy(nums, nums.length - k, rotatedArray, 0, k);
        System.arraycopy(nums, 0, rotatedArray, k, nums.length - k);

        return rotatedArray;
    }
}
