// Median of 2 sorted arrays of different size

class MedianAfterMerge {

    public static double findMedian(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < n) {
            merged[k++] = a[i++];
        }

        while (j < m) {
            merged[k++] = b[j++];
        }

        int total = n + m;

        if (total % 2 == 1) {
            return merged[total / 2];
        }
        // If even
        else {
            return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 5, 6, 12, 15};
        int[] b = {3, 4, 6, 10, 10, 12};

        double median = findMedian(a, b);
        System.out.println("Median: " + median);
    }
}