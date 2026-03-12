// Kth smallest element in a row-column wise sorted matrix


class Main {

    static int countLessEqual(int[][] mat, int mid, int n) {
        int row = n - 1;
        int col = 0;
        int count = 0;

        while (row >= 0 && col < n) {
            if (mat[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }

    static int kthSmallest(int[][] mat, int n, int k) {
        int low = mat[0][0];
        int high = mat[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (countLessEqual(mat, mid, n) < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {16, 28, 60, 64},
                {22, 41, 63, 91},
                {27, 50, 87, 93},
                {36, 78, 87, 94}
        };

        int k = 3;
        int n = mat.length;

        System.out.println(kthSmallest(mat, n, k));
    }
}
