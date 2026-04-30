// Count of number of given string in 2D character array

class WordSearch2D{

    static int R = 4, C = 5;

    static int[] dx = {-1, 1, 0, 0}; // up, down, left, right
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {

        char[][] mat = {
                {'S','N','B','S','N'},
                {'B','A','K','E','A'},
                {'B','K','B','B','K'},
                {'S','E','B','S','E'}
        };

        String target = "SNAKES";

        int result = countOccurrences(mat, target);
        System.out.println("Output: " + result);
        System.out.println("Day67 Dsa problem solved");
    }

    static int countOccurrences(char[][] mat, String word) {
        int count = 0;
        boolean[][] visited = new boolean[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    count += dfs(mat, word, i, j, 0, visited);
                }
            }
        }
        return count;
    }

    static int dfs(char[][] mat, String word, int x, int y, int index, boolean[][] visited) {

        // If full word matched
        if (index == word.length()) {
            return 1;
        }

        if (x < 0 || y < 0 || x >= R || y >= C ||
            visited[x][y] || mat[x][y] != word.charAt(index)) {
            return 0;
        }

        visited[x][y] = true;

        int count = 0;

        for (int dir = 0; dir < 4; dir++) {
            count += dfs(mat, word, x + dx[dir], y + dy[dir], index + 1, visited);
        }

        visited[x][y] = false;

        return count;
    }
}
