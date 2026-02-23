// Median of 2 sorted arrays of equal size

class MedianOfTwoSortedArrays {

    public static double findMedian(int[] a, int[] b) {
        int n = a.length;
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++) {
            m1 = m2;

            if (i == n) {
                m2 = b[j++];
            }
            else if (j == n) {
                m2 = a[i++];
            }
            else if (a[i] < b[j]) {
                m2 = a[i++];
            }
            else {
                m2 = b[j++];
            }
        }

        return (m1 + m2) / 2.0;
    }

    public static void main(String[] args) {
        int[] a = {-5, 3, 6, 12, 15, 18};
        int[] b = {-12, -10, -6, -3, 4, 8};

        double median = findMedian(a, b);
        System.out.println("Median: " + median);
    }
}
