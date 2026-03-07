// Print elements in sorted order using row-column wise sorted matrix	

import java.util.*;

class SortMatrix{
    public static void main(String[] args) {
        int N = 4;

        int[][] mat = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        // Step 1: Store elements in 1D array
        int[] arr = new int[N * N];
        int k = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[k++] = mat[i][j];
            }
        }

        // Step 2: Sort the array
        Arrays.sort(arr);

        // Step 3: Put back into matrix
        k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                mat[i][j] = arr[k++];
            }
        }

        // Step 4: Print sorted matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
            
        }
        System.out.println("Day40 DSA Problem Solved");
    }
}