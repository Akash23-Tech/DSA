// Lexicographically Next Permutation of given String

import java.util.Arrays;

class Solution{

    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int left = i + 1;
        int right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};

        System.out.println("Before: " + Arrays.toString(arr));
        nextPermutation(arr);
        System.out.println("After : " + Arrays.toString(arr));
    }
}
