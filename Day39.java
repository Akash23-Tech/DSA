// Find row with maximum no. of 1's

class Solution {

    public static int rowWithMax1s(int[][] arr) {
        int n = arr.length;
        if (n == 0) return -1;

        int m = arr[0].length;
        int maxRowIndex = -1;

        int i = 0;        // Start from first row
        int j = m - 1;    // Start from last column

        while (i < n && j >= 0) {
            if (arr[i][j] == 1) {
                maxRowIndex = i; 
                j--;             
            } else {
                i++;             
            }
        }

        return maxRowIndex;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 1, 1, 1},
            {0, 0, 0, 0}
        };

        System.out.println(rowWithMax1s(arr));
    }
}
