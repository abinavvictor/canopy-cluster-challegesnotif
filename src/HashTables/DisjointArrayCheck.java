package HashTables;

import java.util.HashSet;

public class  DisjointArrayCheck{

public static boolean isDisjoint(int[] arr1, int[] arr2) {


    HashSet<Integer> hSet = new HashSet<>();
    //Initializing set with arr1 elements
    for (int i = 0; i < arr1.length; i++) {
        if (!hSet.contains(arr1[i])) hSet.add(arr1[i]);
    }

    // Checking if arr2 elements are in the set
    for (int i = 0; i < arr2.length; i++) {
        // Return false if there is an element in arr2 that is also in arr1
        if (hSet.contains(arr2[i])) return false;
    }
    return true;
}
}