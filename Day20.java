// Find if there is any subarray with sum equal to 0

import java.util.HashMap;

class ZeroSumSubarray {

    static void printZeroSumSubarray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == 0) {
                System.out.print("Zero-sum subarray: ");
                printArray(arr, 0, i);
                return;
            }


            if (map.containsKey(prefixSum)) {
                int start = map.get(prefixSum) + 1;
                System.out.print("Zero-sum subarray: ");
                printArray(arr, start, i);
                return;
            }

            map.put(prefixSum, i);
        }

        System.out.println("No zero-sum subarray found");
    }

    static void printArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        printZeroSumSubarray(arr);
        System.out.println("Day18 problem completed");
    }
}
