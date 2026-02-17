// Smallest Subarray with sum greater than a given value

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int n = arr.length;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            // Shrink the window while sum is greater than x
            while (currentSum > x) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start];
                start++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int x = 51;
        int[] arr = {1, 4, 45, 6, 0, 19};

        System.out.println(smallestSubWithSum(x, arr));
    }
}
