package Arrays;

public class MinVaLInArray {
    public static int findMinimum(int[] arr) {
        int minimum = arr[0];// Initialize minimum to the first element of the array
        // Iterate over the array, starting from the second element
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < minimum) { // Update if a smaller element is found
                minimum = arr[i];
            }
        }
        return minimum;
    }

}
