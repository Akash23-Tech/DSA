// Search an element in a Matrix

class SearchInSortedMatrix {

    public static boolean search(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        int row = 0;
        int col = m - 1; // start from top-right

        while (row < n && col >= 0) {
            if (mat[row][col] == x) {
                return true;
            } else if (mat[row][col] > x) {
                col--;        // move left
            } else {
                row++;        // move down
            }
        }
        return false;
    }

    public static void main(String[] args) {   
        int[][] mat = {
            {3, 30, 38},
            {20, 52, 54},
            {35, 60, 69}
        };

        int x = 62;

        boolean result = search(mat, x);
        System.out.println(result);
        System.out.println("Day37 problem completed");
    }
}