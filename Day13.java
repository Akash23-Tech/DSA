// Merge Overlapping Intervals

import java.util.*;

class Solution {
    public static int[][] mergeIntervals(int[][] arr) {
        if (arr == null || arr.length == 0)
            return new int[0][0];

        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();

        
        int[] current = arr[0];
        result.add(current);

        
        for (int i = 1; i < arr.length; i++) {
            int[] next = arr[i];

            if (next[0] <= current[1]) {
                
                current[1] = Math.max(current[1], next[1]);
            } else {
            
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
