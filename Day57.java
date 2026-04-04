// Word Wrap Problem [VERY IMP]

import java.util.Arrays;

class WordWrap{

    public static int solveWordWrap(int[] arr, int k) {
        int n = arr.length;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n] = 0; // base case

        // Fill DP from back
        for (int i = n - 1; i >= 0; i--) {
            int len = 0;

            for (int j = i; j < n; j++) {
                len += arr[j];

                // Add spaces between words
                if (j > i) len += 1;

                if (len > k) break;

                int cost;

                // Last line → no cost
                if (j == n - 1) {
                    cost = 0;
                } else {
                    int extra = k - len;
                    cost = extra * extra;
                }

                if (dp[j + 1] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], cost + dp[j + 1]);
                }
            }
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 5, 4};
        int k = 6;

        System.out.println(solveWordWrap(arr, k)); 
        System.out.println("Day57 Dsa problem solved");
    }
}
