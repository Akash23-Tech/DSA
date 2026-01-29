// Find all pairs on integer array whose sum is equal to given number

import java.util.HashSet;
import java.util.Set;

class PairSum {

    public static void findPairs(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println(complement + ", " + num);
            }

            seen.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 6, -2, 4, 7};
        int target = 7;

        findPairs(arr, target);
    }
}

