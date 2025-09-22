package Arrays;

public class RemoveEvenIntegers {
    public static int[] removeEven(int[] arr) {
        int m = 0;
        //Find number of odd elements in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                m++;
        }

        //Create odds array with the size equal to the number of odd elements in arr
        int[] odds = new int[m];
        int result_index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)// Check if the item in the array is not even
                odds[result_index++] = arr[i]; // If it isn't even, append it to the odds array
        }

        return odds;
    }
}
