// Merge Overlapping Intervals

import java.util.*;

class Solution {
    public static int[][] mergeIntervals(int[][] arr) {
        if (arr == null || arr.length == 0)
            return new int[0][0];

        // Step 1: Sort intervals by start time
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        // Step 2: Add first interval
        int[] current = arr[0];
        result.add(current);

        // Step 3: Merge overlapping intervals
        for (int i = 1; i < arr.length; i++) {
            int[] next = arr[i];

            if (next[0] <= current[1]) {
                // Overlapping case
                current[1] = Math.max(current[1], next[1]);
            } else {
                // Non-overlapping case
                current = next;
                result.add(current);
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,4}, {6,8}, {9,10}};
        int[][] merged = mergeIntervals(arr);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
