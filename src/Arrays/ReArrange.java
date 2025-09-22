package Arrays;

public class ReArrange {
    public static void rearrange(int[] arr) {
        int leftMostPosEle = 0;
        for (int curr = 0; curr < arr.length; curr++) {
            // If negative number found
            if (arr[curr] < 0) {
                if (curr != leftMostPosEle) {
                    // Swapping with leftmost positive
                    int temp = arr[curr];
                    arr[curr] = arr[leftMostPosEle];
                    arr[leftMostPosEle] = temp;
                }
                leftMostPosEle++;
            }
        }
}
