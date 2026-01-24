// Merge 2 sorted arrays without using Extra space.

import java.util.Arrays;

class Solution{

    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

            
                Arrays.sort(arr2);
                Arrays.sort(arr1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        int n = arr1.length;
        int m = arr2.length;

        merge(arr1, arr2, n, m);

        System.out.println("arr1 :");
        for (int x : arr1) {
            System.out.print(x + " ");
        }

        System.out.println("\narr2 :");
        for (int x : arr2) {
            System.out.print(x + " ");
            
        }
    }
}
