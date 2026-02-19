// Minimum swaps required bring elements less equal K together

class MinSwapsK {

    public static int minSwaps(int[] arr, int k) {
        int n = arr.length;

        // Step 1: Count elements <= k
        int good = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                good++;
            }
        }

        // Step 2: Count bad elements in first window of size 'good'
        int bad = 0;
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int minSwaps = bad;

        // Step 3: Slide the window
        for (int i = 0, j = good; j < n; i++, j++) {

            // Remove element going out of window
            if (arr[i] > k) {
                bad--;
            }

            // Add new element coming into window
            if (arr[j] > k) {
                bad++;
            }

            minSwaps = Math.min(minSwaps, bad);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 3};
        int k = 3;

        System.out.println(minSwaps(arr, k));  // Output: 1
    }
}
