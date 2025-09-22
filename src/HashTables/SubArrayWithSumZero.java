package HashTables;
import java.util.*;

public class SubArrayWithSumZero {
    static boolean findSubZero(int[] arr) {
        HashMap<Integer, Integer> ht = new HashMap<>();
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] == 0 || sum == 0 || ht.containsKey(sum))
                return true;

            ht.put(sum, i);
        }

        return false;
    }

}
