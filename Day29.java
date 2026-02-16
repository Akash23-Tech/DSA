// Chocolate Distribution problem

import java.util.Arrays;

class ChocolateDistribution {

    public static int findMinDifference(int[] arr, int m) {
        int n = arr.length;

        // Edge cases
        if (m == 0 || n == 0) {
            return 0;
        }

        if (m > n) {
            return -1; // Not enough packets
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Find minimum difference among m consecutive packets
        for (int i = 0; i <= n - m; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        int result = findMinDifference(arr, m);
        System.out.println(result);
    }
}
