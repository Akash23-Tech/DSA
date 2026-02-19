// Minimum swaps required bring elements less equal K together

class MinSwapsK{

    public static int minSwaps(int[] arr, int k) {
        int n = arr.length;

        int good = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= k) {
                good++;
            }
        }

        int bad = 0;
        for (int i = 0; i < good; i++) {
            if (arr[i] > k) {
                bad++;
            }
        }

        int minSwaps = bad;

        for (int i = 0, j = good; j < n; i++, j++) {

            if (arr[i] > k) {
                bad--;
            }

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
