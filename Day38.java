// Find median in row wise sorted matrix

import java.util.Arrays;

class Solution{

    public static void main(String[] args) {

        int[][] mat = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        int n = mat.length;
        int m = mat[0].length;

        // Step 1: Store all elements into 1D array
        int[] arr = new int[n * m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[index++] = mat[i][j];
            }
        }

        // Step 2: Sort the array
        Arrays.sort(arr);

        // Step 3: Find median
        int median = arr[(n * m) / 2];

        System.out.println("Median is: " + median);
        System.out.println("Day39 problem completed");
    }
}
