package Arrays;

public class secondMax {
    public static int findSecondMaximum(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // First iteration
        for (int item : nums) {
            if (item > firstMax)
                firstMax = item;
        }

        // Second iteration
        for (int item : nums) {
            if (item != firstMax && item > secondMax) {
                secondMax = item;
            }
        }

        return secondMax;
    }
}
