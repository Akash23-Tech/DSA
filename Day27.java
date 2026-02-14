// Find the triplet that sum to a given value

import java.util.Arrays;

class TripletSum {

    public static void findTriplet(int[] arr, int targetSum) {
        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];

                if (currentSum == targetSum) {
                    System.out.println("Triplet found: " 
                        + arr[i] + ", " 
                        + arr[left] + ", " 
                        + arr[right]);
                    return; 
                } 
                else if (currentSum < targetSum) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }

        System.out.println("No triplet found.");
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 4, 2, 6, 9};
        int target = 24;

        findTriplet(arr, target);
    }
}

