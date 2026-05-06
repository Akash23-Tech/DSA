// Search a Word in a 2D Grid of characters

class Main {

    static int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};

    static boolean searchWord(char[][] grid, int row, int col, String word) {

        if (grid[row][col] != word.charAt(0))
            return false;

        int n = grid.length;
        int m = grid[0].length;
        int len = word.length();

        for (int dir = 0; dir < 8; dir++) {
            int k, rd = row + x[dir], cd = col + y[dir];

            for (k = 1; k < len; k++) {
                if (rd < 0 || rd >= n || cd < 0 || cd >= m)
                    break;

                if (grid[rd][cd] != word.charAt(k))
                    break;

                rd += x[dir];
                cd += y[dir];
            }

            if (k == len)
                return true;
        }
        return false;
    }

    static void patternSearch(char[][] grid, String word) {
        int n = grid.length;
        int m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (searchWord(grid, i, j, word)) {
                    System.out.println("Word found at: " + i + ", " + j);
                }
            }
        }
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'A','K','A','S','H'},
                {'X','Y','Z','A','K'},
                {'A','K','A','S','H'},
                {'H','S','A','K','A'}
        };

        String word = "AKASH";

        patternSearch(grid, word);
        System.out.println("Day68 Dsa problem completed");
    }
}
