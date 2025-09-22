package HashTables;
import java.util.*;
public class TwoNumbersSumK {
    public static int[] findSum(int[] nums, int value) {
        Set<Integer> foundValues = new HashSet<>();

        for (int num : nums) {
            // Calculate the complement value needed to reach the value from num
            int complement = value - num;

            // Check if the complement value is already in the foundValues set
            if (foundValues.contains(complement)) {
                // If found, return a list containing the complement and num
                return new int[]{complement, num};
            }

            // If complement is not found, add num to the foundValues set
            foundValues.add(num);
        }

        return new int[0];
    }

}
