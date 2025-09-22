package Arrays;

public class ProductofanArrayexceptItself {
    public static int[] findProduct(int arr[]) {
        int n = arr.length;
        int i, left = 1;
        int product[] = new int[n];

        // Product of elements on left side excluding arr[i]  //left pass
        //tow steps 1. first step assign the product[i] with left
        //2.calculate left= left = arr[0] 8
        for (i = 0; i < n; i++) {
            product[i] = left;
            left *= arr[i];
        }

        // Second pass: Update the product list by calculating products from right to left
        int right = 1;
        for (i = n - 1; i >= 0; i--) {
            product[i] *= right;
            right *= arr[i];
        }

        return product;
    }
}
