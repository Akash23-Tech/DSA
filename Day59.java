// Find next greater number with same set of digits. [Very Very IMP]

import java.util.Arrays;

class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find first decreasing element
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: If found, find next greater element
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }

        // Step 3: Reverse the remaining elements
        reverse(arr, i + 1, n - 1);
    }

    // Helper function to swap
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper function to reverse array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}