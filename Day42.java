// Find a specific pair in matrix

class SpecificPairMatrix{

    static int findMaxValue(int[][] mat, int n) {

        int maxValue = Integer.MIN_VALUE;

        int[][] maxArr = new int[n][n];

        maxArr[n - 1][n - 1] = mat[n - 1][n - 1];

        // Last row
        int max = mat[n - 1][n - 1];
        for (int j = n - 2; j >= 0; j--) {
            if (mat[n - 1][j] > max)
                max = mat[n - 1][j];
            maxArr[n - 1][j] = max;
        }

        // Last column
        max = mat[n - 1][n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (mat[i][n - 1] > max)
                max = mat[i][n - 1];
            maxArr[i][n - 1] = max;
        }

        // Process rest of matrix
        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {

                int potential = maxArr[i + 1][j + 1] - mat[i][j];
                if (potential > maxValue)
                    maxValue = potential;

                maxArr[i][j] = Math.max(mat[i][j],
                        Math.max(maxArr[i][j + 1], maxArr[i + 1][j]));
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 2, -1, -4, -20},
                {-8, -3, 4, 2, 1},
                {3, 8, 6, 1, 3},
                {-4, -1, 1, 7, -6},
                {0, -4, 10, -5, 1}
        };

        int n = mat.length;

        System.out.println("Maximum Value: " + findMaxValue(mat, n));
    }
}
