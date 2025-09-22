package HashTables;
import java.util.*;

public class FirstNonRepeatingInteger {
    public static int findFirstUnique(int[] nums) {

        HashMap <Integer, Integer> countElements = new HashMap<> ();

        for (int i = 0; i < nums.length; i++) {
            if (countElements.containsKey(nums[i])) {
                int occurence = countElements.get(nums[i]) + 1;
                countElements.put(nums[i], occurence);
            } else
                countElements.put(nums[i], 0);
        }

        for (int i = 0; i < nums.length; i++) {
            if (countElements.get(nums[i]) == 0) {
                return nums[i];
            }
        }
        //If no such element is found, return -1
        return -1;
    }
}
